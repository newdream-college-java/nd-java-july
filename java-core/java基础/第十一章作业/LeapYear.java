package ��11����ҵ;
/*1.6�����һ���ж�ĳ���Ƿ�����ķ�����Ȼ���� main �����е��ã�������*/
import java.util.Scanner;

public class LeapYear {
	public String leap(int year) {
		 if (year%4==0&&year%100!=0||year%400==0) {
			return  year+"������";
		}
		 return year+"��������";
	}
	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		System.out.print("��������ݣ�");
		int year=inputScanner.nextInt();
		LeapYear lpy=new LeapYear();
		System.out.println(lpy.leap(year));
	}
}
