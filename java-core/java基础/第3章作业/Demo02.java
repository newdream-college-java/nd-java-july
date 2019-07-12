/*输入一个年份，判断是闰年还是平年*/
import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个年份：");
		int a=input.nextInt();
		boolean b=true;
		if(a%4==0){
			if(a%400==0){
				System.out.println(a+"年是闰年");
			}else if(a%100!=0){
				System.out.println(a+"年是闰年");
			}else{
				System.out.println(a+"年是平年");
			}
		}else{
			System.out.println(a+"年是平年");
		}
	}
}