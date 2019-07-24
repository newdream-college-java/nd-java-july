package demo06;

import java.util.Scanner;

public class LeapYearTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		LeapYear ly=new LeapYear();
		System.out.print("请输入年份：");
		int year=input.nextInt();
		if(ly.leapYear(year)){
			System.out.println(year+"年是闰年");
		}else{
			System.out.println(year+"年是平年");
		}
	}
}
