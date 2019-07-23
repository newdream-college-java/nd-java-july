package work;

import java.util.Scanner;

/**
 * 【扩展--选做】 1. 根据三角形的三条边长，判断其是直角、钝角，还是锐角三角形。主要 功能如下:1)先输入三角形三条边的边长
 * 2)判断是否构成三角形，是否构成条件是“任意 两 边之和大于第三边“，若不能则提示错误 3)若能构成，判断三角形的任意一边的平方等 于
 * 其它两边的平方的和，则为直角三角形;若任意一边的平方大于其它两边平方的和，则为 钝 角三角形;否则，为锐角三角形。
 */

public class Triangle8 {
	public void input() {
		int[] a = new int[3];
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			for (int i = 0; i < 3; i++) {
				System.out.print("请输入第" + (i + 1) + "条边：");
				a[i] = scanner.nextInt();
			}
			judge(a);
			System.out.println("继续吗？(y/n)");
			String s = scanner.next();
			if(s.equals("n")){
				System.out.println("结束");
			}
			while(!s.equals("y")){
				System.out.println("输入错误,请重新输入！");
				s = scanner.next();
			}
		
		}
	}

	public void judge(int[] arr) {
		if (arr[0] + arr[1] <= arr[2] || arr[1] + arr[2] <= arr[0]
				|| arr[0] + arr[2] <= arr[1]) {
			System.out.println("不构成三角形！！");
		} else if (arr[0] * arr[0] == arr[1] * arr[1] + arr[2] * arr[2]
				|| arr[1] * arr[1] == arr[1] * arr[1] + arr[0] * arr[0]
				|| arr[2] * arr[2] == arr[1] * arr[1] + arr[0] * arr[0]) {
			System.out.println("是直角三角形！！");
		} else if (arr[0] * arr[0] > arr[1] * arr[1] + arr[2] * arr[2]
				|| arr[1] * arr[1] > arr[0] * arr[0] + arr[2] * arr[2]
				|| arr[2] * arr[2] > arr[1] * arr[1] + arr[0] * arr[0]) {
			System.out.println("是钝角三角形！！");
		} else {
			System.out.println("是锐角三角形！！");
		}

	}

	public static void main(String[] args) {
		Triangle8 triangle = new Triangle8();
		triangle.input();
	}
}
