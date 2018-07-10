import java.util.*;
import java.sql.*;
public class main
{
	public static void main(String arg[])
 {  
      System.out.println("Give one option in one of them:-");
     System.out.println("\t\t if you want to Registeration press->  1");
	 System.out.println("\t\t if you have already register and want to Login press->  1");
	 System.out.println("\t\t if you are Admin thanfor login press->  3");
	 Scanner ms=new Scanner(System.in);
      
 try{
	    int option=ms.nextInt();
 switch(option)
 {
	 case 1:
	 Register re=new Register();
	 re.reg();
	 break;
	 
	 case 2:
	 Login lo=new Login();
	 lo.log();
	 break;
	 
	  case 3:
	 Login a_lo=new Login();
	 a_lo.a_log();
	 break;
	 
	 default:
	 System.out.println("incorrect input by you ");
	 
 }
 }
 catch(Exception e)
 {
	 
 }
	 
	
 
 }

}