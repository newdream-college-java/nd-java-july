/*
8、(挑战题)输入一个小数，然后输出其整数部份和小数部份,格式如下 
小数 	整数部份  	小数部份 
3.14	 3 	 0.14 
*/
import java.util.*;
public class Demo08{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个小数：");
		double number = input.nextDouble();
		int x = (int)number/1;
		double y =number-x;
		System.out.println("小数\t整数部分\t小数部分");
		System.out.println(number+"\t"+x+"\t\t"+y);
	}
}