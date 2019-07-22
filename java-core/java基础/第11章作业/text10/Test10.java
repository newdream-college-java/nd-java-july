package proJob11.text10;
/*
  编写一个方法求 n!(n 的阶乘)，用递归方法实现 提示:递归方法指直接或间接
地调用自身的方法，n 的阶乘递归可表示
 */
import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入想求的阶乘：");
		int n=input.nextInt();
		System.out.println(n+"的阶乘为："+jiechen(n));
	}
	
	public static int jiechen(int n) {
		if(n<=1) {
			return 1;
		}else {
			return n*jiechen(n-1);
		}
	}
}
