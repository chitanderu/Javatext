

import java.util.ArrayList;
import java.util.List;
public  abstract class Hamburger {  //每个汉堡都有自己的名称 配料 
  
	                                   
	String name;
    String dough;
    String diy;
    List<String> toppings = new ArrayList<>();
	public void prepare() {
		     System.out.println("preparing"+name); 
		     
		     for (String topping : toppings) {
		            System.out.println("   " + topping);}// TODO Auto-generated method stub
		
	}

	public void cut() {
		System.out.println("cutting"); 	// TODO Auto-generated method stub
		 
	}

	public void box() {
		System.out.println("finsh!");// TODO Auto-generated method stub
		
	}
	
	
	
  public  String  gettype()
  
  {
	  return name;
  }
  
}
