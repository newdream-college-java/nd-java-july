/*1、输入一个三位整数，判其是不是降序数如:531 是降序数 百位>十位>个位*/
import java.util.Scanner;
public class A{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入三位数字:");
		int num=input.nextInt();
		int a=num%10;
		int b=num/10%10;
		int c=num%100;
		if(c>b&&b>a){			
			System.out.println(num+"是降序数");
		}else{
			System.out.println(num+"不是降序数");
		}
	}
}