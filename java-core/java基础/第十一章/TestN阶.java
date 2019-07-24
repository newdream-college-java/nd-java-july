package 十一章;

import java.util.Scanner;

public class TestN阶 {

	/**
	 * @param args
	 */
	public static int jiecheng(int n) {
		if (n <= 1) {
			return 1;
		}
		return n * jiecheng(n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("请输入要求的阶乘数:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(jiecheng(n));

	}

}
