/*8、(挑战题)输入一个小数，然后输出其整数部份和小数部份,格式如下 
小数 整数部份  小数部份 
3.14 3  0.14 */
import java.util.Scanner;
public class I{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个小数：");
		double a = input.nextDouble();
		int b = (int)a/1;
		double c = a-b;
		System.out.println("小数\t整数部分\t小数部分");
		System.out.println(a+"\t"+b+"\t\t"+c);
}
}