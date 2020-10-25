package packge1;
//要被代理的人即RealSubject角色
public class Xiaoming implements DoHamburger{

	@Override
	public void cutfruit() {
		
		
		System.out.println("切水果装饰汉堡");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addbeef() {
		System.out.println("加牛肉带汉堡上");// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		System.out.println("汉堡完成并且清理设备");     // TODO Auto-generated method stub
		
	}
	
	
	

}
