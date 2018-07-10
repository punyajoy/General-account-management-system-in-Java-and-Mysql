import java.sql.*;
import java.util.*;
public class delete
{
public void del(int i) throws Exception
    {
		     connect c=new connect();
			PreparedStatement st=c.con.prepareStatement("delete from user where id=?");
			st.setInt(1,i);
			int no=st.executeUpdate();
		if(no>0)
			 {
				 System.out.println("\t\tYou have Succesfully delete The detail");
				 Profile pf=new Profile();
			    pf.fetch();
		  }

		
	}   
 
}  