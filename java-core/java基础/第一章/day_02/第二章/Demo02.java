/*2、输入一个变量保存正方形的边长，计算此正方形的周长，及面积。*/
import java.util.Scanner;
public class Demo02{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入正方形的边长：");
		int a=input.nextInt();
		int c,s;
		c=2*(2*a);
		s=a*a;
		System.out.println("边长\t周长\t及面积");	
		System.out.println(a+"\t"+c+"\t"+s);	
	}
}