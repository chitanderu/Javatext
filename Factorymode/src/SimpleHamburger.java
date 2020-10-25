/**
 * Simplehamburger是新类，
 * 它只做一件事情
 * 帮助客户创建汉堡。
 */
public class SimpleHamburger {
      
	  
	  public Hamburger creatit(String type)   //根据不同的类型来选择汉堡
	  { 
		  Hamburger hamburger=null;
		  
		  
		  if(type.equals("beef")){ 
			  hamburger = new beefhamburger();
	        }else if(type.equals("pig")){
	        	hamburger = new pighamburger();}
	       
		  
		  
		  
		  
		return  hamburger ;
		  
		  
	  }
	
	
	
}
