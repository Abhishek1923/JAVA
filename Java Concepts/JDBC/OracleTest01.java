import java.sql.*;

class OracleTest01{
	public static void main(String[] args)throws Exception{

// JDBC driver name and database URL
   String JDBC_DRIVER =  "oracle.jdbc.driver.OracleDriver";    
   String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE"; 

   //  Database credentials
   String USER = "system"; //system
   String PASS = "oracle";
   
   //Load the driver
     Class.forName(JDBC_DRIVER);

      //Open a connection
      System.out.println("Connecting to database...");
      Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
	  
	  System.out.println("CONNECTION DONE !! TNX GOD");	
	
	Statement st = con.createStatement();
	String sql = "UPDATE EMP SET SALARY=2424 WHERE EMPID=101";
	int i = st.executeUpdate(sql);
	System.out.println("Updated "+i);
	con.close();
	}
}