/*2.1编程实现输入年份，月份，然后输出这一年这一月的日历。1900年1.1是星期一*/
import java.util.Scanner;
public class Work07{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入年份：");
		int year=sc.nextInt();
		System.out.print("请输入月份：");
		int month =sc.nextInt();
		int sum=0;
		//整年的天数
		for(int i=1900;i<year;i++){
			if(i%400==0||(i%4==0&&i%100!=0)){
				sum+=366;
			}else {
				sum+=365;
			}
			
		}
		//整月的天数
		for(int i=1;i<month;i++){
			if(i==2){
				if(year%100==0||(year%4==0&&year%100!=0)){
					sum+=29;
				}else{
					sum+=28;
				}
			}else if(i==4||i==6||i==9||i==11){
				sum+=30;
			}else {
				sum+=31;
			}	
		}
		sum+=1;
		System.out.println("\t\t\t"+year+"年"+month+"月");
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		for(int i=1;i<=sum%7;i++){
			System.out.print("\t");
		}
		int days =0;//这个月的总天数
		if(month==2){
				if(year%100==0||(year%4==0&&year%100!=0)){
					days=29;
				}else{
					days=28;
				}
			}else if(month==4||month==6||month==9||month==11){
				days=30;
			}else {
				days=31;
			}
		for(int i=1;i<=days;i++){//i表示日期
			System.out.print(i+"\t");
			if(sum++%7==6){
				System.out.println();
			}
			//sum++;
		}
		
		
	}
}
