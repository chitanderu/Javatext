
public class KFC extends Hamburgerstore{

	@Override
	Hamburger creatHamburger(String item) {
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
