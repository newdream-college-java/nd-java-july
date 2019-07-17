/*
编程实现输入年份，月份，然后输出这一年这一月的日历
*/
import java.util.Scanner;
public class Demo07{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//输入所要查询的日期
		System.out.print("请输入年份：");
		int year = input.nextInt();
		System.out.print("请输入月份：");
		int month = input.nextInt();
		int sum = 0;
		//计算该月一号到1900年一月一号的时间sum
		//年份之和
		for(int i = 1900;i<year;i++){
			if((i%4==0&&i%100!=0)||i%400==0){
				sum+=366;
			}
			else{
				sum+=365;
			}
		}
		//加上月份天数
		for(int i =1;i<month;i++){
			if(i == 2){
				if((year%4==0&&year%100!=0)||year%400==0){
					sum+=29;
				}
				else{
					sum+=28;
				}	
			}
			else if (i ==4||i == 6||i == 9||i == 11){
					sum+=30;
			}
			else{
					sum+=31;
			}
		}
		//加上一号天数
		sum++;
		//输出日历
		System.out.println("\t\t\t"+year+"年"+month+"月");
		System.out.println("日"+"\t"+"一"+"\t"+"二"+"\t"+"三"+"\t"+"四"+"\t"+"五"+"\t"+"六");
		for(int i = 1;i<=sum%7;i++){
			System.out.print("\t");
		}
		//求出该月的天数
		int day = 0;
		if(month == 2){
				if((year%4==0&&year%100!=0)||year%400==0){
					day = 29;
				}
				else{
					day = 28;
				}	
			}
		if (month ==4||month == 6||month == 9||month== 11){
				day=30;
		}
		else{
				day=31;
		}
		for(int i = 1;i<=day;i++){
			if(sum%7==6){
				System.out.println(i);
				sum++;
			}
			else{
				System.out.print(i+"\t");
				sum++;
			}
		}
		
}
}