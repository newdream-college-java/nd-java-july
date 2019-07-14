/*2、输入一个年份，判是闰年还是平年*/
import java.util.Scanner;
public class B{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入年份：");
		int years=input.nextInt();
		if(years%400==0||years%4==0&&years%100!=0){
			System.out.println(years+"是闰年");
		}else{
			System.out.println(years+"不是闰年");
		}
	}
}