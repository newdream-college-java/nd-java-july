package Chapter11_类的无参方法;

/*
	设计一个判断某年是否闰年的方法，然后在 main 方法中调用，输出结果
*/

import java.util.*;

public class LeapYear {
	public static void main(String [] args){
		Scanner input =new Scanner(System.in);
		int a=input.nextInt();
        LeapYear leapYear=new LeapYear();
        leapYear.judge(a);
	}
	
	public void judge(int year) {
		if(year%400==0||year%4==0&&year%100!=0){
			System.out.println("该年是闰年！");
		}else{
			System.out.println("该年是平年!");
		}
	}
}
