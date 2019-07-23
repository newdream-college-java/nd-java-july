package chapter12;

import java.util.Scanner;

/*
 1. 根据三角形的三条边长，判断其是直角、钝角，还是锐角三角形。主要功能如下:

 1)先输入三角形三条边的边长
 2)判断是否构成三角形，是否构成条件是“任意 两边之和大于第三边“，若不能则提示错误 
 3)若能构成，判断三角形的任意一边的平方等于其它两边的平方的和，则为直角三角形;
 若任意一边的平方大于其它两边平方的和，则为 钝角三角形;否则，为锐角三角形
 */

public class JudgeTheAngle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("请输入第一条边：");
			int a = input.nextInt();
			System.out.print("请输入第二条边：");
			int b = input.nextInt();
			System.out.print("请输入第三条边：");
			int c = input.nextInt();

			JudgeTheAngle judgeTheAngle = new JudgeTheAngle();
			judgeTheAngle.judge(a, b, c);
			System.out.print("继续吗？(y/n):");
			String d = input.next();
			if (d.equals("y")) {
				continue;
			} else {
				System.out.println("谢谢使用！！");
				break;
			}
		}
	}

	public void judge(int a, int b, int c) {
		if(a+b>c&&a+c>b&&b+c>a){
			if(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a){
				System.out.println("这是一个直角三角形！");
			}else if(a*a+b*b<c*c||a*a+c*c<b*b||b*b+c*c<a*a){
				System.out.println("这是一个钝角三角形！");
			}else if(a==b&&b==c){
				System.out.println("这是一个等边三角形！");
			}else{
				System.out.println("这是一个锐角三角形！");
			}
		}else{
			System.out.println("这不能构成三角形！");
		}
	}

}
