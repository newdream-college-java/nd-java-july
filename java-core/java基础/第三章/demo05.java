/*5、输入三个 int 型的数据，放入到 a,b,c 三个变量中去，
使用条件结构与交换逻辑将这三个变量中的值从小到大排列。*/
import java.util.Scanner;
public class demo05{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入三个整数：");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int tmp;
		if(a>b){
			tmp=a;
			a=b;
			b=tmp;
		}
		if(a>c){
			tmp=a;
			a=c;
			c=tmp;
		}
		if(b>c){
			tmp=b;
			b=c;
			c=tmp;
		}
		System.out.println(a+"<"+b+"<"+c);
	}
}