/*
2、输入一个变量保存正方形的边长，计算此正方形的周长，及面积。 
*/
import java.util.Scanner;
public class Demo02{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入正方形的边长：");
		int a= input.nextInt();
		int c = 4*a;
		int s= a*a;
		System.out.println("该正方形的周长为："+c+"面积为："+s);
	}
}