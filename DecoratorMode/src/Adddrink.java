
public class Adddrink implements Diydrink{
     public int sum=0; 
	private Food drink;
	
	
	public Adddrink(Food drink)
	{  
		this.drink=drink;
	}
	
	public int cout()
	{
		return sum;
	}
	
	@Override
	public String getalldiyfood() {
		                                     // TODO Auto-generated method stub
		return  drink.getalldiyfood();
	}

	@Override
	public int getdiy() {
		                                     // TODO Auto-generated method stub
		System.out.println("饮料配料选择");
	    System.out.println("1.椰果");
	    System.out.println(" 2.草莓");
	    System.out.println(" 3.珍珠");
	    System.out.println(" 4.退出");
	    boolean a=true;
		 
		while(a) {   //添加配料
			   switch(KS.scanint())
			   {   case 1: {    System.out.println("椰果配料+1");         
				                      
			                            sum+=5;    break;                }
				   
			       case 2: {    System.out.println("草莓配料+1");         
	           
	                                          sum+=8;            break;           }

			       case 3: {    System.out.println("珍珠配料+1");         
		           
	               sum+=7;                    break;   }
			       
			       
			       case 4: { a=false; break;
			    	   
			       }
			       
			       
			   }    
			       
	    
	    
	    
	    
	    
	   
	}
	
	
	 return sum;
	

}
}