/*编程实现输入年份，月份，然后输出这一年这一月的日历。*/
import java.util.*;
public class Demo07{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入年份：");
		int year=input.nextInt();
		System.out.print("请输入月份：");
		int month=input.nextInt();
		border(year,month);
	}
	
	public static void border(int year,int month){//输出日历表
		System.out.println("\t\t      "+year+"年"+month+"月\n");
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		int sum=0;
		sum=yearNum(year)+monthNum(year,month)+1;
		for(int i=1;i<=sum%7;i++){
			System.out.print("\t");
		}
		for(int i=1;i<=day(year,month);i++){
			System.out.print(i+"\t");
			if(sum%7==6){
				System.out.println();
			}
			sum++;
		}
	}
	
	public static int yearNum(int year){//从1900-1-1到year-1年的天数
		int sum=0;
		for(int i=1900;i<year;i++){
			if(i%4==0&&i%100!=0||i%400==0){
				sum+=366;
			}else{
				sum+=365;
			}
		}
		return sum;
	}

	public static int monthNum(int year,int month){//某年1-1到month-1的天数
		int sum=0;
		for(int i=1;i<month;i++){
			sum+=day(year,i);
		}
		return sum;
	}
	
	public static int day(int year,int month){//某年中某个月的天数
		int days=0;
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
		return days;
	}
}