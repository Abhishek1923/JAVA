import java.sql.*;
import oracle.jdbc.internal.OracleTypes;

class OracleAppSP{
	public static void main(String[] args)throws Exception{

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
	
	CallableStatement st = con.prepareCall("{call test02_insert(?,?,?)}");
	st.setInt(1,108);
	st.setString(2,"Paras");
	st.setInt(3, 8888);
	st.executeUpdate();
	System.out.println("Stored Proc Done !!!");
	}
}