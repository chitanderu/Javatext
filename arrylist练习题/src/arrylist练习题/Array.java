package arrylist练习题;
import java.util.*;
public class Array {

	
	public static void main(String args[])
	{  
		
		List<people> a=new ArrayList<people>();  //只能添加people类型的list数组
		for(int i=0;i<4;i++)
		{people b=new people();   //实例化
		b.name=KS.scanstr();      //赋值
		b.id=1234; 
		a.add(b);}   //自动扩容
		
		 for(int i=0;i<a.size();i++)
		 {
			 people k=a.get(i);
			   System.out.println(k.id+" "+k.name);  // 打印ArrayList id和name
			 
		 }
		 
		 //添加数字
		 people c=new people();
		 c.name=KS.scanstr();
		 c.id=KS.scanint();
		 a.add(c);    //扩容
		 
		 //再打印
		 

		 for(int i=0;i<a.size();i++)
		 {
			 people d=a.get(i);
			   System.out.println(d.id+" "+d.name);  // 打印ArrayList id和name
			 
		 }
		 int z=KS.scanint();//
		//	自动减少								 
		a.remove(z);//移除下标为a的元素												//		ArrayList b=new ArrayList();
														//		    int[] c=new int[10];
														//		   for(int i=0;i<4;i++)
														//		   {  c[i]=i;

		 for(int i=0;i<a.size();i++)
		 {
			 people d=a.get(i);
			   System.out.println(d.id+" "+d.name);    //再打印
		 }										        	       
													
															 
		 //获取指定下标的元素：
		 int n=KS.scanint();
		  people f= a.get(n);
		  System.out.println(f.id+" "+f.name+"  下标为"+n);    //再打印
																	 
												
         }
	
	
	
}