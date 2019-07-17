/*	
	编程实现输入年份，月份，然后输出这一年这一月的日历。
*/

import java.util.Scanner;

public class G{
	public static void main (String [] args){
		Scanner input =new Scanner(System.in);
		int sum=0;
		System.out.print("请输入年份：");
		int year=input.nextInt();
		System.out.print("请输入月份：");
		int month=input.nextInt();
		//计算从1900年到该年份有多少天
		for(int i=1900;i<year;i++){
			if(i%400==0||i%4==0&&i%100!=0){
				sum=sum+366;
			}else{
				sum=sum+365;
			}
		}
		for(int i=1;i<month;i++){
			if(i==2){
				if(year%400==0||year%4==0&&year%100!=0){
					sum=sum+29;
				}else{
					sum=sum+28;
				}
			}else if(i==4||i==6||i==9||i==11){
				sum=sum+30;
			}else{
				sum=sum+31;
			}
		}
		System.out.println("总共天数为："+sum);
		sum=sum+1;
		int week=sum%7;
		System.out.println("该月份的一号是星期"+week);
		//制定日历的表格
		System.out.println("\t\t\t"+year+"年"+month+"月\n");
		System.out.println("日\t一\t二\t三\t四\t五\t六\n");
		//计算输入月份的天数
		int day=0;
		if(month==2){
			if(year%400==0||year%4==0&&year%100!=0){
				day=29;
			}else{
				day=28;
			}
		}else if(month==4||month==6||month==9||month==11){
			day=30;
		}else{
			day=31;
		}
		//判断1号从表格的哪个位置开始
		for(int i=week;i>0;i--){
			System.out.print("\t");
		}
		//打印所有日期
		for(int i=1;i<=day;i++){
			System.out.print(i+"\t");
			week++;
			if(week%7==0){
				System.out.println();
			}
		}	
	}
}