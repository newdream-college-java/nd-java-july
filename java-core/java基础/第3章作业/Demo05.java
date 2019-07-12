/*输入三个 int 型的数据，放入到 a,b,c 三个变量中去，
使用条件结构与交换逻辑将这三个变量中的值从小到大排列。*/
import java.util.Scanner;
public class Demo05{
	public static void  main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入3个整数：");
		System.out.print("a=");
		int a=input.nextInt();
		System.out.print("b=");
		int b=input.nextInt();
		System.out.print("c=");
		int c=input.nextInt();
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