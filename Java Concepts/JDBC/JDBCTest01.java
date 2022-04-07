import java.sql.*;

class JDBCTest01{
	public static void main(String[] args)throws Exception{

// JDBC driver name and database URL
   String JDBC_DRIVER =  "oracle.jdbc.driver.OracleDriver";    
   String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE"; 

   //  Database credentials
   String USER = "system"; //system
   String PASS = "system";
   
   //Load the driver
     Class.forName(JDBC_DRIVER);

      //Open a connection
      System.out.println("Connecting to database...");
      Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
	  
	  System.out.println("CONNECTION DONE !! TNX GOD");	
	
	//Statement st = con.createStatement();
	/*
	String update = "UPDATE EMP SET SALARY=? WHERE EMPID=?";
	PreparedStatement ps = con.prepareStatement(update);
	ps.setInt(1,1111);
	ps.setInt(2,101);
	*/
	/*
	String insert = "INSERT INTO EMP VALUES(?,?,?,?)";	
	PreparedStatement ps = con.prepareStatement(insert);
	ps.setInt(1,107);
	ps.setString(2,"Bhavya");
	ps.setString(3,"Hisar");
	ps.setInt(4,1001);
	int i = ps.executeUpdate();
	*/
	
	String select = "SELECT *FROM EMP";	
	PreparedStatement ps = con.prepareStatement(select);
	
	ResultSet rs = ps.executeQuery();
	while(rs.next()){
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	}
	
	
	con.close();
	}
}