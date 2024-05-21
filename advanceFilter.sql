-- DROP FUNCTION public.sp_mb_advance_filter_3(json);

CREATE OR REPLACE FUNCTION public.sp_mb_advance_filter_3(filters json)
 RETURNS refcursor
 LANGUAGE plpgsql
AS $function$
DECLARE
    v_where_clause TEXT := 'WHERE 1 = 1';
    v_data JSONB;
    x_result REFCURSOR := 'cur';
BEGIN
    CREATE TEMPORARY TABLE IF NOT EXISTS tb_multiple_search_temp_9(
        client_code VARCHAR(20),
        project_code VARCHAR(20),
        pm_name VARCHAR(200),
        csm_name VARCHAR(20),
        dl_name VARCHAR(20),
        charge_account VARCHAR(200)
    );

    INSERT INTO tb_multiple_search_temp_9
    WITH data AS (
        SELECT filters::json AS json_data
    )
    SELECT
        json_array_elements(json_data->'client_checkbox')->>'code' AS client_code,
        json_array_elements(json_data->'project_checkbox')->>'code' AS project_code,
        json_array_elements(json_data->'pm_checkbox')->>'value' AS pm_name,
        json_array_elements(json_data->'csm_checkbox')->>'value' AS csm_name,
        json_array_elements(json_data->'dl_checkbox')->>'value' AS dl_name,
        json_array_elements(json_data->'charge_account_checkbox')->>'value' AS charge_account
    FROM data;

    IF EXISTS (SELECT 1 FROM tb_multiple_search_temp_9 WHERE client_code IS NOT NULL) THEN
        v_where_clause := v_where_clause || ' AND tmt.client_code IN (SELECT client_code FROM tb_multiple_search_temp_9)';
    END IF;

    IF EXISTS (SELECT 1 FROM tb_multiple_search_temp_9 WHERE project_code IS NOT NULL) THEN
        v_where_clause := v_where_clause || ' AND tmt.project_code IN (SELECT project_code FROM tb_multiple_search_temp_9)';
    END IF;

    IF EXISTS (SELECT 1 FROM tb_multiple_search_temp_9 WHERE pm_name IS NOT NULL) THEN
        v_where_clause := v_where_clause || ' AND f_get_emp_name_by_emp_id(tpm.project_manager_name) IN (SELECT pm_name FROM tb_multiple_search_temp_9)';
    END IF;

    IF EXISTS (SELECT 1 FROM tb_multiple_search_temp_9 WHERE csm_name IS NOT NULL) THEN
        v_where_clause := v_where_clause || ' AND f_get_emp_name_by_emp_id(tpm.csm_name) IN (SELECT csm_name FROM tb_multiple_search_temp_9)';
    END IF;

    IF EXISTS (SELECT 1 FROM tb_multiple_search_temp_9 WHERE dl_name IS NOT NULL) THEN
        v_where_clause := v_where_clause || ' AND f_get_emp_name_by_emp_id(tpm.portfolio_lead_name) IN (SELECT dl_name FROM tb_multiple_search_temp_9)';
    END IF;

    IF EXISTS (SELECT 1 FROM tb_multiple_search_temp_9 WHERE charge_account IS NOT NULL) THEN
        v_where_clause := v_where_clause || ' AND tmt.charge_account IN (SELECT charge_account FROM tb_multiple_search_temp_9)';
    END IF;

    EXECUTE format('
        SELECT jsonb_agg(row_to_json(T)) 
        FROM (
            SELECT *
            FROM tb_milestone_txn tmt
            LEFT JOIN tb_project_master tpm ON tpm.project_code = tmt.project_code
            %s
        ) T
    ', v_where_clause) INTO v_data;

    TRUNCATE tb_multiple_search_temp_9;

    OPEN x_result FOR SELECT v_data AS "object";
    RETURN x_result;
END;
$function$
;
