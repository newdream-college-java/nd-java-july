package demo06;

import java.util.Scanner;

public class LeapYearTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		LeapYear ly=new LeapYear();
		System.out.print("��������ݣ�");
		int year=input.nextInt();
		if(ly.leapYear(year)){
			System.out.println(year+"��������");
		}else{
			System.out.println(year+"����ƽ��");
		}
	}
}
