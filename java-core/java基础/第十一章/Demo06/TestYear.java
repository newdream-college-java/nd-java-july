package chapter11;

import java.util.Scanner;

public class TestYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("请输入你要查询的年份：");
		int year = input.nextInt();
		
		Year year1 =new Year();
		year1.judge(year);
		
	}

}
