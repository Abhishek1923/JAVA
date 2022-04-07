import java.sql.*;  
class DatabaseMetaDataTest{  
public static void main(String args[]){  
try{  
/*
Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/sample", "postgres", "system");
		System.out.println("Connection created");	
*/
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


		  
DatabaseMetaData dbmd=con.getMetaData();  
  
System.out.println("Driver Name: "+dbmd.getDriverName());  
System.out.println("Driver Version: "+dbmd.getDriverVersion());  
System.out.println("UserName: "+dbmd.getUserName());  
System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  
  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  