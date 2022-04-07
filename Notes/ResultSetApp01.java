import java.sql.*;

class ResultSetApp01{
	public static void main(String[] args)throws Exception{

   String JDBC_DRIVER =  "oracle.jdbc.driver.OracleDriver";  
   String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE"; 
   String USER = "system";  //"mydatabase"; //system oracle
   String PASS = "oracle";
   Class.forName(JDBC_DRIVER);
      System.out.println("Connecting to database...");
      Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
	  System.out.println("Connected....");
	  
	  Statement st = con.createStatement();
	  String query = "select *from emp";
	  ResultSet rs = st.executeQuery(query);
	  while(rs.next()){
		  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
	  }
	  con.close();
	  
	}
}