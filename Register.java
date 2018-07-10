import java.sql.*;
import java.util.*;
public class Register
{
 
  public void reg() throws Exception
	 { 
		Scanner sc=new Scanner(System.in);
	 connect c=new connect();
    Statement st=c.con.createStatement();
	 System.out.println("Enter your good Name:-");
                 String name=sc.nextLine();
				 System.out.println("Enter your Address where you live:-");
                 String address=sc.nextLine();
				 System.out.println("Enter your Personal mobile no:-");
                 long mob=sc.nextLong();
		     String query="INSERT INTO `user`(`name`, `address`, `mob`) VALUES  ('"+name+"','"+address+"','"+mob+"')";
			// System.out.println(query);
			 int no=st.executeUpdate(query);
			 if(no>0)
			 {
				 System.out.println("\t\tYou have Succesfully Register your detail");
				 main ob=new main();
			 }
			 else
			 {
				 System.out.println("\t\t Sry some error in your detail ,you cant Register this time");
			 }
	 
		 
	 }
	
	 
	 
	
	 

		 
	 
		
}
