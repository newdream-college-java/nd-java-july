/*5、输入一个整数，代表有 n 个小时，计算 n 个小时等于多少天
零多少个小时。比如输入：25，那么输出“1 天零 1 个小时”*/
import java.util.Scanner;
public class demo05{
	public static void main(String[]args){
	Scanner input=new Scanner(System.in);
	System.out.println("请输入有多少个小时：");
	int hours =input.nextInt();
	int day=hours/24;
	int hour=hours%24;
	System.out.println(day+"天零"+hour+"个小时");
	}
}