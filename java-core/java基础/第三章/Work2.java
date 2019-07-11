/*2、输入一个年份，判是闰年还是平年*/
import java.util.Scanner;
public class Work2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个年份：\t");
		int year = input.nextInt();
		if(year%400==0){
			System.out.println(year+"年是闰年");
		}else if(year%100!=0&&year%4==0){
			System.out.println(year+"年是闰年");
		}else System.out.println(year+"年是平年");		
	}
}