import java.sql.*;
import java.util.*;
public class Profile
{
	Scanner sc=new Scanner(System.in);
	void fetch(int a) throws Exception
	{    connect c=new connect();
			Statement st=c.con.createStatement();
			String query="select * from user where id='"+a+"'";
			ResultSet rs=st.executeQuery(query);
			 while(rs.next())
			 {
				 
				 int id=rs.getInt(1);
				 String name=rs.getString("name");
				 String add=rs.getString("address");
				 String mob=rs.getString("mob");
				 System.out.println();
				  System.out.println("\t\t your id is"+id);
				  System.out.println("\t\t your Name is"+name);
				  System.out.println("\t\t your Address is"+add);
				  System.out.println("\t\t your Mobile no is"+mob);
				  update(id,name,add,mob);
			 }
	    
		
	}
void fetch() throws Exception
	{    connect c=new connect();
			Statement st=c.con.createStatement();
			String query="select * from user";
			ResultSet rs=st.executeQuery(query);
			 while(rs.next())
			 {
				 
				 int id=rs.getInt(1);
				 String name=rs.getString("name");
				 String add=rs.getString("address");
				 String mob=rs.getString("mob");
				 System.out.println();
				  System.out.println("\t\t your id is"+id);
				  System.out.println("\t\t your Name is"+name);
				  System.out.println("\t\t your Address is"+add);
				  System.out.println("\t\t your Mobile no is"+mob);
			 }
	
		  del();   
		
	}	
	
	void update(int ar1,String ar2,String ar3,String ar4) throws Exception
	{
		System.out.println("if you want to update your data write yes");
	String option=sc.next();
	if(option.equals("yes"))
	{
		Update upd=new Update();
		upd.up(ar1,ar2,ar3,ar4);
	}
	else
	{
		main ob=new main();
	}
		 
		
	}
 
 void del() throws Exception
	{
		System.out.println("Are u wanted to delete any data give  yes");
	String doption=sc.next();
	if(doption.equals("yes"))
	{
		System.out.println("to delete any data give their id Pls");
		int d=sc.nextInt();
		delete dd=new delete();
		dd.del(d);
	}
	else
	{
		main ob=new main();
	}
		 
		
	}
 
 
}  