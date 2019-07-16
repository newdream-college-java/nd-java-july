/*
计算今年 1 月 1 日到今天的总天数
*/
import java.util.*;
public class Demo06{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = input.nextInt();
		System.out.println("请输入月份：");
		int month = input.nextInt();
		System.out.println("请输入日：");
		int days= input.nextInt();
		int sum =0;
		for(int i =2019;i<year;i++){
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
		sum+=days-1;
		System.out.print("总天数为："+sum);
	}
}
