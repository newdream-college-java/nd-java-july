/*输入一个变量保存正方形的边长，计算此正方形的周长，及面积*/
import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入正方形的边长：");
		int a = input.nextInt();
		int area = a*a;
		int perimeter = 4*a;
		System.out.println("周长为："+perimeter);
		System.out.println("面积为:"+area);
		
	}
}