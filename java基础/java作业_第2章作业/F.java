/*5、输入一个整数，代表有 n 个小时，计算 n 个小时等于多少天零多少个小时。
比如输入： 25，那么输出“1 天零 1 个小时” */
import java.util.Scanner;
public class F{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int a = input.nextInt();
		int time;
		int day;
		day = a/24;
		time = a%24;
		System.out.println("这是："+day+"\t天"+time+"\t小时");
}
}