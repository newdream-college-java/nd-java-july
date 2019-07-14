/*5、输入三个 int 型的数据，放入到 a,b,c 三个变量中去，使用条件结构与交换逻辑将这三个变量中的值从小到大排列。*/
import java.util.Scanner;
public class Sort{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入第一个数：");
		int a=input.nextInt();
		System.out.print("请输入第二个数：");
		int b=input.nextInt();
		System.out.print("请输入第三个数：");
		int c=input.nextInt();
		if(a>b){
			a=a+b;
			b=a-b;
			a=a-b;
		}
		if(b>c){
			b=b+c;
			c=b-c;
			b=b-c;
		}
		if(a>b) {
			a=a+b;
			b=a-b;
			a=a-b;
		}
		System.out.println("结果为："+a+"，"+b+"，"+c);
	}
}