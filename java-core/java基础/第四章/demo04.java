/*2.3、输入一个数字，如果这个数字是 1，那么输出星期一，如果这个数字是 2，那
么就输出星期二，如果这个数字是 3，那么就输出星期三。。。。。。如果是其他就输出
输入错误！(switch)*/
import java.util.Scanner;
public class demo04{
	public static void main (String [] args){
		Scanner input= new Scanner(System.in);
		System.out.println("输入一个数字");
		int mc=input.nextInt();
		switch(mc)
		{
			case 1:
			System.out.println("星期一");
			break;
			case 2:
			System.out.println("星期二");
			break;
			case 3:
			System.out.println("星期三");
			break;
			default:
			System.out.println("输入错误");
		}
	}
}