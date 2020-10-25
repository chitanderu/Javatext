
import java.util.*;   //静态输入类
import java.io.*;
public class KS {
      
     public static String scanstr()
     {
    	 String str=" ";
    	  try {
    		  Scanner in =new Scanner(System.in);
    		  str=in.next();
    	    } catch  (Exception e ) {}
             
    	  return str;
     }
     
     public static int scanint()
     {  int a=0;
       Scanner in =new Scanner(System.in);
    	 a= in.nextInt();
    	 
    	 return a;
     }
     

    public static double scandouble()
    {
    	 double  b=0.0;
    	Scanner in =new Scanner(System.in);
    	b=in.nextDouble();
    	return b;
    		
    }
 
    
  
     
      
      
}
