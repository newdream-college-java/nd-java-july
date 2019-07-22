package 第11章作业;
/*1.6、设计一个判断某年是否闰年的方法，然后在 main 方法中调用，输出结果*/
import java.util.Scanner;

public class LeapYear {
	public String leap(int year) {
		 if (year%4==0&&year%100!=0||year%400==0) {
			return  year+"是闰年";
		}
		 return year+"不是闰年";
	}
	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		System.out.print("请输入年份：");
		int year=inputScanner.nextInt();
		LeapYear lpy=new LeapYear();
		System.out.println(lpy.leap(year));
	}
}
