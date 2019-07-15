/*1.3、编程使用 while 循环输出：100、95、90、85……、5。*/
public class Work03{
	public static void main(String [] args){
		int i=100;
		while(i>1){
			if(i%5==0)
			System.out.println(i);
			i--;
		}
	}
}