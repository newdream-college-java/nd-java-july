/*2、输入一个年份，判是闰年还是平年*/
import java.util.Scanner;
public class demo02{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个年份：");
		int a = input.nextInt();
		if(a%100==0){
			if(a%400==0){
				System.out.println("是闰年");
			}else{
				System.out.println("是平年");
			}
		}else if(a%4==0){
			System.out.println("是闰年");
		}else{
			System.out.println("是平年");
		}
		
	}
}