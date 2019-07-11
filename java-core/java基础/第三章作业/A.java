/*  、输入一个三位整数，判其是不是降序数如:531 是降序数  百位>十位>个位   */

import java.util.Scanner;

public class A{
	public static void main(String[ ] args) {
		Scanner input=new Scanner(System.in);
		int i=input.nextInt();
		int a,b,c;
		a=i/100;
		b=i/10%10;
		c=i%10;
		if(a>b&&b>c){
		System.out.println("该整数为降序数");
		}else{
		System.out.println("该整数不为降序数");
		}
	}
}