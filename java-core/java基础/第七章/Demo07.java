/*编程实现输入年份，月份，然后输出这一年这一月的日历。
如输入 2019 年 1 月 输出如下：*/
import java.util.Scanner;
public class Demo07{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		System.out.print("输入年份：");
		int year =input.nextInt();
		System.out.print("输入月份：");
		int month =input.nextInt();
		//1、总天数=年天数+月天数+1
		int sum=0;
		//年天数
		for(int i=1900;i<year;i++){
			if(i%4==0&&i%100!=0||i%400==0){
				sum+=366;
			}else{
				sum+=365;
			}
		}
		//+月天数
		for(int i=1;i<month;i++){
			if(i==2){
				if(year%4==0&&year%100!=0||year%400==0){
					sum+=29;
				}else{
					sum+=28;
				}
			}else if(i==4||i==6||i==9||i==11){
				sum+=30;
			}else{
				sum+=31;
			}
		}
		//+1
		sum++;
		System.out.println(sum%7);
		//2、放在日历表上
		System.out.println("\t\t\t"+year+"年"+month+"月\n");
		System.out.println("日\t一\t二\t三\t四\t五\t六\t");
		for(int i=1;i<=sum%7;i++){
			System.out.print("\t");
		}
		int days;
		if(month==2){
			if(year%4==0&&year%100!=0||year%400==0){
				days=29;
			}else{
				days=28;
			}
		}else if(month==4||month==6||month==9||month==11){
			days=30;
		}else{
			days=31;
		}
		for(int i=1;i<=days;i++){
			System.out.print(i+"\t");
			if(sum++%7==6){
				System.out.println();
			}
		}
	}
}