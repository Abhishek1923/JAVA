import java.sql.*;
import oracle.jdbc.internal.OracleTypes;

class OracleSelectSP{
	public static void main(String[] args)throws Exception{

	int id = Integer.parseInt(args[0]);
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
	  
	//PreparedStatement st = con.prepareStatement("insert into test02 values(?,?,?)");
	
	CallableStatement st = con.prepareCall("{call test02_select(?,?)}");
	st.setInt(1,id);
	//register the OUT parameter before calling the stored procedure
	st.registerOutParameter(2, java.sql.Types.VARCHAR);
			
	st.executeUpdate();
			
	//read the OUT parameter now
	String name = st.getString(2);
			
	System.out.println("Name from Stored Procedure "+name);
	System.out.println("Stored Proc Done  !!!");
	}
}