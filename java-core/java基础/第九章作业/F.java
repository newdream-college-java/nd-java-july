package Chapter09_array;

/*
 从键盘上输入 10 个整数，合法值为 1、2、3。不是这 3 个数则为非法数字。
 编程统计每个 整数和非法数字的个数。
 */

import java.util.*;

public class F {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[10];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
			if (a[i] != 1 && a[i] != 2 && a[i] != 3) {
				count++;
			}
		}
		System.out.println("非法数字有：" + count + "个");
	}

}
