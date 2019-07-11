/*输入一个小数，然后输出其整数部份和小数部份*/

import java.util.Scanner;
public class A8{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个小数");
		double a =input.nextDouble();
		int b =(int)a;
		System.out.println("小数\t整数部分\t小数部分");
		System.out.println(a+"\t"+b+"\t\t"+(a-b));
	}
}