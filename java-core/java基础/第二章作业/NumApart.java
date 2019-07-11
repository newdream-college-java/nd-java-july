/*8、(挑战题)输入一个小数，然后输出其整数部份和小数部份,格式如下*/
import  java.util.Scanner;
public class NumApart{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入小数：");
		double num=input.nextDouble();
		int a=(int)num/1;
		double b=num-a;
		System.out.println("小数\t整数部分\t小数部分");
		System.out.println(num+"\t"+a+"\t\t"+b);
	}
}