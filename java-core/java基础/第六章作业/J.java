/*
	循环录入 3 位会员的信息，会员号合法，显示录入信息；否则显示录入失败
*/

import java.util.Scanner;

public class J{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.print("请输入会员号（<4位整数>）：");
			int a=input.nextInt();
			System.out.print("请输入会员生日（月/日）：");
			String b=input.next();
			System.out.print("请输入会员积分(<4位整数>）：");
			int c=input.nextInt();
			if(a/1000!=0&&a/10000==0){
				System.out.println("您录入的会员信息是：");
				System.out.println(a+"\t"+b+"\t"+c);
			}else
				System.out.println("会员号格式错误，录入失败！！！");
		}
	}
}