/*、输入三个 int 型的数据，放入到 a,b,c 三个变量中去，使用条件结构与交换逻辑将这三个变量中的值从小到大排列。*/

import java.util.Scanner;
public class A5 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入第一个整数");
		int a = input.nextInt();
		System.out.print("请输入第二个整数");
		int b = input.nextInt();
		System.out.print("请输入第三个整数");
		int c = input.nextInt();
		int d;
		if(a>b){
			d=a;a=b;b=d;
		}if(a>c){
			d=a;a=c;c=d;
		}if(b>c){
			d=b;b=c;c=d;
		}
		System.out.println(a+"<"+b+"<"+c);
	}
}