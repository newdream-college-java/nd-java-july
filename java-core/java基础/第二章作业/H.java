/*(挑战题)输入一个小数，然后输出其整数部份和小数部份,格式如下 
    小数       整数部份    小数部份 
    3.14       3                0.14 */

import java.util.Scanner;

public class H{
	public static void main(String []  args){
	System.out.println("小数\t整数部分\t小数部分");
	Scanner input=new Scanner(System.in);
	double n=input.nextDouble();	
	double x=n%1;
	double y=n-x;
	System.out.print(n+"\t"+y+"\t\t"+x);
	} 
}