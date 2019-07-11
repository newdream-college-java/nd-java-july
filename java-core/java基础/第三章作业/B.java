/*输入一个年份，判是闰年还是平年 */

import java.util.Scanner;

public  class  B{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int year=input.nextInt();
		if(year%400==0||year%4==0&&!(year%100==0)){
		System.out.println("该年份为闰年");
		}else{
		System.out.println("该年份为平年");
		}
	}
}