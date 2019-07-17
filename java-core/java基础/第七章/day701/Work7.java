/*【练习 2】 训练要点
编程实现输入年份，月份，然后输出这一年这一月的日历。*/
import java.util.Scanner;
public class Work7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入年份：");
		int year = sc.nextInt();
		System.out.print("请输入月份：");
		int month = sc.nextInt();
		//求年天数
		int sum = 0;
		for(int i = 1900;i<year;i++){
			if(i%100!=0&&i%4==0||i%400==0){
				sum+=366;
			}
			sum+=365;
		}
		//求月天数
		for(int i = 1;i<month;i++){
			if(i==2){
				if(year%100!=0&&year%4==0||year%400==0){
					sum+=29;
				}else 
					sum+=28;
			}else if(i==4||i==6||i==9||i==10){
				sum+=30;
			}else
				sum+=31;
		}
		//求星期几
		//输出日历表
		//求这个月有多少天
		int days  =0;
		if(month==2){
			if(year%100!=0&&year%4==0||year%400==0){
				days=29;
			}else 
				days = 28;
		}else if(month==4||month==6||month==9||month==10){
			days=30;
		}else
			days=31;		
		System.out.println("\t\t     "+year+"年"+month+"月日历\n");
		System.out.println("日\t一\t二\t三\t四\t五\t六\t");
		for(int i =1;i<=sum%7;i++){
			System.out.print("\t");
		}
		for(int i = 1;i<=days;i++){
			if(sum++%7==6){
				System.out.println(i);
			}else
				System.out.print(i+"\t");
		}	
		
	}
}