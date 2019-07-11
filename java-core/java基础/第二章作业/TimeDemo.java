/*5、输入一个整数，代表有 n 个小时，计算 n 个小时等于多少天零多少个小时。比如输入：25，那么输出“1 天零 1 个小时”*/
import  java.util.Scanner;
public class TimeDemo{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入时间：");
		int time=input.nextInt();
		int day,hour;
		day=time/24;
		hour=time%24;
		System.out.println("输入的时间（小时）\t天数\t剩余时间（小时）");
		System.out.println(time+"\t\t\t"+day+"\t"+hour);
	}
}