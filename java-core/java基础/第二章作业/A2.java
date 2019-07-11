/*输入一个变量保存正方形的边长，计算此正方形的周长，及面积。*/
import java.util.Scanner;
public class A2{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入正方形的边长");
		double a = input.nextDouble();
		double c = 4*a;
		double s = a*a;
		System.out.println("正方形的周长为"+c+"正方形的面积为"+s);
	}
}