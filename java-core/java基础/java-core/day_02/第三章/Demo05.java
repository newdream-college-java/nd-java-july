/*5、输入三个int型的数据，放入到a,b,c三个变量中去，使用条件结构与交换逻辑将这三个变量中的值从小到大排列。*/
import java.util.*;
public class Demo05{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("请输入三个整数：");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int temp;
		if(a>b){
			temp=a;
			a=b;
			b=temp;
		}
		if(a>c){
			temp=a;
			a=c;
			c=temp;
		}
		if(b>c){
			temp=b;
			b=c;
			c=temp;
		}
		System.out.println(a+"\t"+b+"\t"+c);
	
	}
}