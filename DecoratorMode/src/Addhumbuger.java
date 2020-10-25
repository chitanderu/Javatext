
public class Addhumbuger implements Diyburger {
	 //	    int chiken=10;   
	  //	    int vegetable=9;
	  //	    int tomat=8;
	  //	    int beef=5;
	  //	    int pig=3;
	  //	    int egg=2;
	private Food  food;
	int sum=0;
	public Addhumbuger(Food food)   //构造方法
		{
			
			this.food=food;
		}
		boolean a=true;
		
		
		 
		
		
		
		
		
		
	public int getdiy()
	{    
		System.out.println("汉堡配料选择");
	    System.out.println("1.鸡肉");
	    System.out.println(" 2.蔬菜");
	    System.out.println(" 3.番茄");
	    System.out.println(" 4.牛肉");
	    System.out.println(" 5.猪肉");
	    System.out.println(" 6.鸡蛋");
	    System.out.println(" 7.退出");
		
		
		
		
		
		
		while(a) {   //添加配料
		   switch(KS.scanint())
		   {   case 1: {    System.out.println("鸡肉配料+1");         
			                      
		                            sum+=10;    break;                }
			   
		       case 2: {    System.out.println("蔬菜配料+1");         
           
                                          sum+=9;            break;           }

		       case 3: {    System.out.println("番茄配料+1");         
	           
               sum+=8;                    break;   }

		       case 4: {    System.out.println("牛肉配料+1");         
	           
               sum+=5;                 break;      }

		   
		       case 5: {    System.out.println("猪肉配料+1");         
	           
               sum+=3;                   break;    }
               
		       
		       case 6: {    System.out.println("鸡蛋配料+1");         
	           
               sum+=2;  break;  
               }
                case 7: {         a=false  ; //exit
	           
                break;   }


		   }
		
	   }
		
		
		
		
	 return sum;
		
	}

	@Override
	public String getalldiyfood() {
		 
		return  food.getalldiyfood();
	}






	public int cout() {
		// TODO Auto-generated method stub
		return sum;
	}

}
