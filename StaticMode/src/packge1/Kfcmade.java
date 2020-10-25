package packge1;
  //kFC  代理人即ProxySubject角色
public class Kfcmade implements DoHamburger{

	
	
	private DoHamburger xiaoming1;  //持有一个被代理人（小明）的引用
	
	public Kfcmade(DoHamburger xiaoming)
	{
		 this.xiaoming1=xiaoming;
	}
	
	/*
	 * 在该类中会持有一个被代理人的引用，在这里指小明 即KFC代替小明完成汉堡的制作
	 */
	
	@Override
	public void cutfruit() {
		      xiaoming1.cutfruit();// TODO Auto-generated method stub
		
	}

	@Override
	public void addbeef() {
		       xiaoming1.addbeef();                // TODO Auto-generated method stub
		 
	}

	@Override
	public void clear() {
		       xiaoming1.clear();                    // TODO Auto-generated method stub
		
	}

	
	
}
