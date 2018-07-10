import java.sql.*;
import java.util.*;
public class Login
{
	
	 void log() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		connect c=new connect();
		PreparedStatement pst=c.con.prepareStatement("SELECT * FROM `user` WHERE `name`=? and `mob`=? ");
	System.out.println("enter name");
	String name=sc.nextLine();
	System.out.println("enter mob");
		long mob=sc.nextLong();
    pst.setString(1,name);		
    pst.setLong(2,mob);	
	 ResultSet rs=pst.executeQuery();    
		if(rs.next())
		{
			int id=rs.getInt(1);
			//System.out.println(id);
			Profile pf=new Profile();
			pf.fetch(id);
		}
		else
		{
			System.out.println("NOT LOGIN:check your mobno or name");
			
		}
			
		}
		
		void a_log() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		connect c=new connect();
		PreparedStatement pst=c.con.prepareStatement("SELECT * FROM `admin` WHERE `name`=? and `password`=? ");
	System.out.println("enter name");
	String name=sc.nextLine();
	System.out.println("enter password");
		String pass=sc.nextLine();
    pst.setString(1,name);		
    pst.setString(2,pass);	
	 ResultSet rs=pst.executeQuery();    
		if(rs.next())
		{
			Profile pf=new Profile();
			pf.fetch();
		}
		else
		 {
			System.out.println("NOT LOGIN:check your mobno or name");
			
		}
			
		}
     
	}   
 
