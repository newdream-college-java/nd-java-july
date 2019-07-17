//打印日历表
import java.util.*;
public class Demo07{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = input.nextInt();
		System.out.println("请输入月份");
		int month = input.nextInt();
		//判断输入月份1号是星期几？
		//1900 1-1星期一 
		//从1900年到输入年份的整的年份天数加上整的月份天数%7
		int sum =0;
		//整年
		for(int i =1900;i<year;i++){
			if(i%4==0&&i%100!=0||i%400==0){
				sum+=366;
			}
			else{
				sum+=365;
			}
		}
		//整月
		for(int i =1;i<month;i++){
			if(i==2){
				if(year%4==0&&year%100!=0||year%400==0){
					sum+=29;
				}
				else
				sum+=28;
			}else if(i==4||i==6||i==9||i==11){
				sum+=30;
			}else{
			sum+=31;
			}
		}
		sum+=1;
		//System.out.print(sum%7);
		//打印1号位置
		System.out.println("\t\t\t"+year+"年"+month+"月\n");
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		for(int i=1;i<=sum%7;i++){
			System.out.print("\t");
		}
		//计算这个月有多少天
		int days=0;
			if(month==2){
				if(year%4==0&&year%100!=0||year%400==0){
					days=29;
				}
				else
				days=28;
			}else if(month==4||month==6||month==9||month==11){
				days=30;
			}else{
			days=31;
			}
		//打印
		for(int i =1;i<=days;i++){
			System.out.print(i+"\t");
			if(sum++%7==6){
				System.out.print("\n");
			}
		}
		
	}
}