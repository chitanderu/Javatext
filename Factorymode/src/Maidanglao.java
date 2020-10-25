 //开一家汉堡店 麦当劳  可以从hamburgerstore取得所有的制作汉堡的功能
public class Maidanglao extends Hamburgerstore{

	@Override
	Hamburger creatHamburger(String item) {   //根据选择的材料的不同返回不同的汉堡
		 
		 if(item.equals("beef"))
		 {  return new beefhamburger();
			  
		     }
		 else if(item.equals("pig"))
		 {   
			  return new pighamburger(); 
		     }
		
		
		return null;
	}
	
	
	
	
	

}
