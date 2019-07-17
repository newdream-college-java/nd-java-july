/*编程实现输入年份，月份，然后输出这一年这一月的日历。*/
import java.util.*;
public class H{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入年份：");
		int year=input.nextInt();
		System.out.print("请输入月份：");
		int month=input.nextInt();
		//自1900年1月1号到输入年份以来整年的天数
		int total=0;
		for(int i=1900;i<year;i++){
			if(i%4==0&&i%100!=0||i%400==0){
				total+=366;
			}else{
				total+=365;
			}
		}
		//输入年份中到输入月份的1号整月的天数
		int days=0;
		for(int i=1;i<month;i++){
			if(i==2){
				if(year%4==0&&year%100!=0||year%400==0){
					days+=29;
				}else{
					days+=28;
				}
			}else if(i==4||i==6||i==9||i==11){
				days+=30;
			}else{
				days+=31;
			}
		}
		int sum=total+days+1;
		//打印日历
		System.out.println("\t\t\t"+year+"年"+month+"月\n");
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		//定1号的位置
		for(int i=1;i<=sum%7;i++){
			System.out.print("\t");
		}
		//判断输入月份有多少天
		int mDays=0;
		if(month==2){
			if(year%4==0&&year%100!=0||year%400==0){
				mDays=29;
			}else{
				mDays=28;
			}
		}else if(month==4||month==6||month==9||month==11){
			mDays=30;
		}else{
			mDays=31;
		}
		for(int i=1;i<=mDays;i++){
			System.out.print(i+"\t");
			if(sum%7==6){
				System.out.print("\n");
			}
			sum++;
		}
	}
}