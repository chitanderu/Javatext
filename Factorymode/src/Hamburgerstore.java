
public  abstract  class Hamburgerstore {   // 考虑到每个地区都有不同类型的工厂    汉堡工厂为抽象的方法 ，不同的工厂可以有不同的方法
	
	SimpleHamburger  factory;  //建立汉堡工厂               //Hamburgerstore作为超类 可以让不同的类型的类去继承这些方法
	
	
//	
//	
//	      public Hamburgerstore(SimpleHamburger factory )  //汉堡商店的构造方法需要一个工厂参数； 
//	      {
//	    	  
//	    	  this.factory=factory;
//	      }       
//	      
	      
	      public Hamburger orderhamburger(String type){
	          Hamburger hamburger;
	          
	          hamburger =   creatHamburger(type);   


	          hamburger.prepare();
	           
	          hamburger.cut();
	          hamburger.box();             //汉堡的制作  准备 切片 装菜盘

	          return hamburger;
	      }
	      
	      
	      
	      abstract Hamburger  creatHamburger(String type);
	      

}
