package 十一章;

import java.util.Scanner;

public class Judge {
	public static void judge(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + "是闰年");
		} else {
			System.out.println(year + "不是闰年");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入要判断的年份：");
		int year = input.nextInt();
		judge(year);
	}
}
