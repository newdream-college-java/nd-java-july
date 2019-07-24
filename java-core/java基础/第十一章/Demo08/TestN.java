package chapter11;

import java.util.Scanner;

public class TestN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("请输入你要求的阶乘数：");
		int num = input.nextInt();
		
		N n = new N();
		System.out.println("阶乘为："+n.jiecheng(num));
	}

}
