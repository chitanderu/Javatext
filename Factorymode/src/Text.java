
public class Text {

	
	   public static  void main(String agrs[])
	   {  
		     //创立两个不同的店
		   
		      Maidanglao Maidanglaostore=new Maidanglao();  //麦当劳
		       KFC        KFCstore=new KFC();               //肯德基
		   
		      //用一家店给小明下订单
		    Hamburger hamburger= Maidanglaostore.orderhamburger("beef");
		    
		    System.out.println("小明在麦当劳点了个"+hamburger.gettype());
		    
		    
		    //用另一家店给小红下订单
		    
		    
		    hamburger=KFCstore.orderhamburger("pig");
		    
		    
		    System.out.println("小红在肯德基点了个"+hamburger.gettype());
		    
		   
		    //两个汉堡都准备好了 。
	        //超类从来不管细节。通过实例化正确的汉堡类，子类会自行照料这一切。 
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
	   }
	
	
	
}
