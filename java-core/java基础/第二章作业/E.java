/*、输入一个整数，代表有 n 个小时，计算 n 个小时等于多少天零多少个小时。
比如输入： 25，那么输出“1 天零 1 个小时” */

import java.util.Scanner;

public class E{
	public static void main (String[] args){
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	int day,hours;
	day=n/24;
	hours=n%24;
	System.out.println(day+"天零"+hours+"个小时");
	}
}