package 第十章;

import java.text.BreakIterator;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class Huikui {
	public void huikui() {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入积分：");
		int a = input.nextInt();
		System.out.print("请输入卡类型：");
		String b = input.next();
		System.out.println("积分：" + a + ",卡类型：" + b);
		if (b.equals("金卡")) {
			if (a > 1000) {
				System.out.println("回馈积分500分！");
			} else {
				return;
			}
		} else if (b.equals("普卡")) {
			if (a > 5000) {
				System.out.println("回馈积分500分！");
			} else {
				return;
			}
		} else {
			return;
		}
	}
}
