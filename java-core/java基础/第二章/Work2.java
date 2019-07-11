/*2、输入一个变量保存正方形的边长，计算此正方形的周长，及面积。*/
import java.util.Scanner;
public class Work2{
	public static void main(String[] args){
		Scanner x = new Scanner(System.in);
		int a = x.nextInt();
		int c,s;
		c = a*4;
		s = a*a;
		System.out.println("周长是："+c+"\t面积是"+s);
	}
}