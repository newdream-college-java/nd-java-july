package proJob11.text7;
//设计一个判断某年是否闰年的方法，然后在 main 方法中调用，输出结果
import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		panDuan();
	}	
	
	public static void panDuan() {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入你想判断的年份：");
		int year=input.nextInt();
		if(year%4==0&&year%100!=0||year%400==0) {
			System.out.println(year+"年是闰年");
		}else {
			System.out.println(year+"年是平年");
		}
	}

}
