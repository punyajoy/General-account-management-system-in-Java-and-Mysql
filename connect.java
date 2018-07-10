import java.sql.*;
public class connect
{   Connection con;
    connect ()throws Exception
{
   Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/test";
			con=DriverManager.getConnection(url,"root","");
 
 }
	
}

  

