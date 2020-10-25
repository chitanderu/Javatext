package packge1;

public class Text {

	
	
	public static void main(String[] args){
		
		Xiaoming he=new Xiaoming();  //小明想吃汉堡
		
		Kfcmade it=new Kfcmade(he);   //找一个代理KFC
	 
		//KFC开始制作
		it.addbeef();
		it.cutfruit();
		it.clear();
		
		
	}
	
	
}
