import java.sql.*;
import oracle.jdbc.internal.OracleTypes;

class BatchTest{
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
	 
	 String SQL = "INSERT INTO Emp VALUES(?, ?, ?, ?)";

// Create PrepareStatement object
PreparedStatement pstmt = con.prepareStatement(SQL);

//Set auto-commit to false
con.setAutoCommit(false);

// Set the variables
pstmt.setInt( 1, 104);
pstmt.setString( 2, "Ddd");
pstmt.setString( 3, "Delhi");
pstmt.setInt( 4, 3344);
// Add it to the batch
pstmt.addBatch();

// Set the variables
pstmt.setInt( 1, 105);
pstmt.setString( 2, "Ccc");
pstmt.setString( 3, "Agra");
pstmt.setInt( 4, 4455);
// Add it to the batch
pstmt.addBatch();

//add more batches
//Create an int[] to hold returned values
int[] count = pstmt.executeBatch();

//Explicitly commit statements to apply changes
con.commit();

		System.out.println("Batch Processing Done !!!");
	}
}