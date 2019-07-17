/*1.1、 编程实现接收用户输入的正整数，输出该数的阶乘。例如：输入数据 4，则
输出 4!=4*3*2*1=24。要求限制输入 1~10，否则提示错误*/

import java.util.Scanner;
public class Work1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum = 1;
		int a;
		while(true){
			System.out.print("请输入一个10以内的个正整数:");
			a = sc.nextInt();
			if(a>10 || a<1){
				System.out.println("输入错误！！请重新输入\n");
				continue;
			}
			break;
		}
		for(int i = 1;i<=a;i++){
			sum = sum*i;
		}
		System.out.println(a+"的阶乘为："+sum);
	}
}
