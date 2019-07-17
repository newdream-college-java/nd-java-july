/*
关键点1：求出这个月的1号是星期几？
这个日期到1900-1-1的总天数%7
比如：2019年7月1号是星期几？
2019年7月1号到1900-1-1的总天数%7
总天数=整年的天数+整月的天数+1
整年的天数=1900+1901+1902+....+2018
整月的天数=1月+2月+3月+4月+5月+6月
7月的1天

关键点2：求出这个月的总天数？

2019-5-1.   3
2020-1-1.   3


7月
	 1		 2		3
	sum%7	sum%7	sum%7
	sum++   sum++

*/
import java.util.*;
public class Demo01{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		System.out.print("请输入年份：");
		int year = input.nextInt();
		System.out.print("请输入月份：");
		int month = input.nextInt();
		//1、总天数%7=(整年的天数+整月的天数+1)%7
		//1.1.整年的天数=1900+1901+1902+....+year-1
		int sum = 0;
		for(int i=1900;i<year;i++){
			if(i%4==0&&i%100!=0||i%400==0){
				sum+=366;
			}else{
				sum+=365;
			}
		}
		//1.2.整月的天数=1月+2月+3月+4月+5月+6月
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
		//1.3.7月的1天
		sum+=1;
		System.out.println(sum%7);

		//2.输出日历表
		System.out.println("\t\t\t"+year+"年"+month+"月\n");
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		//3.输出1号"
		for(int i=1;i<=sum%7;i++){
			System.out.print("\t");
		}
		//4.关键2：求出month月的天数
		int days = 0;//这个月的天数
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
		/*System.out.print(1+"\t");
		System.out.print(2+"\t");
		System.out.print(3+"\t");*/
		for(int i=1;i<=days;i++){//i表示这个月的几号
			System.out.print(i+"\t");
			//这一天是星期六就换行
			//if(这一天是星期六？){
			if(sum++%7==6){
				System.out.println();
			}
			//sum++;		
		}
	}
}






