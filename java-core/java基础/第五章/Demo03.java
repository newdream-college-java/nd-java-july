/*1.3、编程使用 while 循环输出：100、95、90、85……、5。*/
public class Demo03{
	public static void main(String [] args){
		int a=100;
		while(a>=5){
			System.out.println(a);
			a-=5;
		}
	}
}