import java.sql.*;
import java.util.*;
public class Update
{
	
	void up(int a,String b,String cc,String d)throws Exception
	{    
	    //System.out.println(a+" "+b+" "+" "+cc+" "+d);
		String name,add,mob;
		Scanner sc=new Scanner(System.in);
		connect c=new connect();
			Statement st=c.con.createStatement();
			System.out.println("Are u want to update your name if no then write only no");
			 name =sc.nextLine();
			if(name.equals("no"))
			{
			    name=b;
			}
            System.out.println("Are u want to update your address if no then write only no");
			 add =sc.nextLine();
			if(add.equals("no"))
			{
			 add=cc;	
			}
			System.out.println("Are u want to update your mobile no if no then write only no");
		mob =sc.nextLine();
			if(mob.equals("no"))
			{
			 mob=d;	
			}
			String q="update user set name='"+ name+"',mob='"+  mob+"',address='"+  add+"' where id='"+ a+"'";
			//System.out.println(q);
			int no=st.executeUpdate(q);
			 if(no>0)
			 {
				 System.out.println("\t\tYou have Succesfully UPDATE your detail");
				 main pf=new main();
			    
		  }
			 else
			 {
				 System.out.println("\t\t Sry some error in your detail ");
			 }
		
	}
	
	
		     
		
	}   
   