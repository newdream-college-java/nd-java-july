/*输入一个 3 位数，分别放入到 3 个变量中去，
编程将这 3 个变量中的值交换后输出。*/

import java.util.Scanner;
public class A6 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个三位数");
		int s = input.nextInt();
		int a = s%10;
		int b = s/10%10;
		int c = s/100;
		int d;
		if(a<b){
			d=a;a=b;b=d;
		}if(a<c){
			d=a;a=c;c=d;
		}if(b<c){
			d=b;b=c;c=d;
		}
		System.out.println(100*a+10*b+c);
	}
}
