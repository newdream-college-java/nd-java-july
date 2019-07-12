/*
2、输入一个年份，判是闰年还是平年
*/
import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个年份：");
		int n = input.nextInt();
		
		if((n%4==0&&n%100!=0)||(n%400==0))
			System.out.println("这是闰年！");
		else
			System.out.println("这不是闰年！");
	}
}