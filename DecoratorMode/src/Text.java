
public class Text {
  
	 public static void main(String args[])
	 {
		    Food burger=new Hamburger(); //实例化具体被装饰的对象汉堡
		     
		    Addhumbuger one=new Addhumbuger(burger);  //为汉堡添加配料
		    one.getdiy();
		    System.out.println("花费"+one.getalldiyfood()+one.cout()+"元");
		    
		    
		    
		    Food drink=new Drink();    //实例化具体被装饰的对象饮料
		    
		    
		    Adddrink two=new  Adddrink(drink);  //为饮料添加配料
		    
		    two.getdiy();
		    
		    
		    System.out.println("花费"+two.getalldiyfood()+two.cout()+"元");
		 
		 
		    
		    System.out.println("一共花费"+(one.cout()+two.cout()));
		 
		 
	 }
	
	
}
