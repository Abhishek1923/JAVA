import  java.sql.*;

public class ResultSetMetaDataTest{
	public static void main(String args[]) throws SQLException, Exception{	
		
		/*
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/sample", "postgres", "system");
		System.out.println("Connection created");	
		*/
		
// JDBC driver name and database URL
   String JDBC_DRIVER =  "oracle.jdbc.driver.OracleDriver";  //"com.mysql.jdbc.Driver";  
   
   String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE"; //"jdbc:mysql://localhost/EMP";
   
   //jdbc:oracle:thin:@localhost:1521:XE
   //jdbc:oracle:thin:@//mydbhostname:1521:mydbsid

   //  Database credentials
   String USER = "system";  //"mydatabase"; //system oracle
   String PASS = "oracle";
   //schema mydatabase  , table test1  proc- my_proc
   
         Class.forName(JDBC_DRIVER);

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
	  
	  System.out.println("CONNECTION DONE !! TNX GOD");

		
		String sql = "SELECT * FROM EMP";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		ResultSetMetaData rsmd = rs.getMetaData();
		
		int n1 = rsmd.getColumnCount();
		
		System.out.println("Total Columns "+n1);		
		for(int i=1;i<=n1;i++){
			System.out.println("getColumnName "+rsmd.getColumnName(i));//getColumnName
			System.out.println("getColumnTypeName "+rsmd.getColumnTypeName(i));
		}		
		/*
		System.out.println("getColumnCount "+n1);
		
		String s1 = rsmd.getColumnName(2);
		System.out.println("getColumnName "+s1);
		
		/*
		String s2 = rsmd.getTableName(1);
		System.out.println("getTableName "+s2);
		
		int n2 = rsmd.getColumnType(1);
		System.out.println("getColumnType "+n2);
		
		
		String s3 = rsmd.getColumnTypeName(2);
		System.out.println("getColumnTypeName "+s3);
		*/
		
		}
	}