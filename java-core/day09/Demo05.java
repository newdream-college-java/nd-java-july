import java.util.Scanner;

public class Demo05 {
	/*
	 * 1.6、从键盘上输入 10 个整数，合法值为 1、2、3。不是这 3 个数则为非法数字。 编程统计每个 整数和非法数字的个数。
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("从键盘上输入 10 个整数,合法值为 1、2、3");
		int[] arr = new int[10];
		int yesunt = 0;
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			int data = input.nextInt();
			arr[i] = data;
			if (data == 2 || data == 1 || data == 3) {
				yesunt++;
			} else {
				sum++;
			}
		}
		System.out.println("\t整数有" + yesunt + "个\t非法数字有" + sum + "个");
	}
}
