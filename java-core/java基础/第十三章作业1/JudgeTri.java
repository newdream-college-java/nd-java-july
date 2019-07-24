package 第十三章作业1;

import java.util.Scanner;

public class JudgeTri {

	public void jTriangle(double a,double b,double c){
		if (a+b>c||a+c>b||b+c>a) {
			if (a*a==b*b+c*c||b*b==a*a+c*c||c*c==b*b+a*a) {
				System.out.println("这是直角三角形。");
			}else if (a*a>=b*b+c*c||b*b>=a*a+c*c||c*c>=b*b+a*a) {
				System.out.println("这是钝角三角形。");
			}else {
				System.out.println("这是锐角三角形。");
			}
		}else {			
			System.out.println("这不能构成三角形。");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputScanner=new Scanner(System.in);
		JudgeTri jt=new JudgeTri();
		while (true) {
			System.out.print("请输入第一条边：");
			double a=inputScanner.nextDouble();
			System.out.print("请输入第一条边：");
			double b=inputScanner.nextDouble();
			System.out.print("请输入第一条边：");
			double c=inputScanner.nextDouble();
			jt.jTriangle(a, b, c);
			System.out.print("继续吗？（y/n）:");
			String n=inputScanner.next();
			if (n.equals("n")) {
				System.out.println("谢谢使用。");
				System.exit(-1);	
			}
		}
	}

}
