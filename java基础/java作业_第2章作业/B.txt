/*2、输入一个变量保存正方形的边长，计算此正方形的周长，及面积。 */
import java.util.Scanner;
public class B{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入边长：");
		int b = input.nextInt();
		int z = b*4;
		int m = b*b;
		System.out.println("正方形的周长为："+z);
		System.out.println("正方形的面积为："+m);
}
}