package 第十三章作业1;
/*1.6、写一个数学家的类，类中有带参数的方法如下:	
a)传入两个整数，进行比较，返回两个数中的最大值的方法。
b)传入一个整数，返回这个整数的个位数是几的方法。
c)传入一个整数，返回这个整数的立方的方法。
d)传入一个正整数，计算从 1 加到此整数的和是多少的方法。比如输入一个 5 那么就计算
1+2+3+4+5=15，最后返回 15*/
import java.util.Scanner;

public class Mathematician {

	public int maxNum(int a, int b) {
		return a > b ? a : b;
	}

	public int countNum(int number) {
		return number % 10;
	}

	public int cubeNum(int number) {
		return number * number * number;
	}

	public int sumNum(int number) {
		int sum = 0;
		for (int i = 1; i <=number; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Mathematician mathematician=new Mathematician();
		while (true) {
			System.out.println("0.退出系统 1.求两数中的最大值 2.求整数的个位 3.求整数的立方 4.求从1累加到输入数的总和");
			System.out.print("请选择你的操作编号：");
			int n = input.nextInt();
			switch (n) {
			case 0:
				System.out.println("成功退出系统！");
				System.exit(-1);
			case 1:
				System.out.println("请输入第一个整数：");
				int a=input.nextInt();
				System.out.println("请输入第二个整数：");
				int b=input.nextInt();
				System.out.println("最大值为："+mathematician.maxNum(a, b));
				break;
			case 2:
				System.out.println("请输入一个整数：");
				int c=input.nextInt();
				System.out.println("个位为："+mathematician.countNum(c));
				break;
			case 3:
				System.out.println("请输入一个整数：");
				int d=input.nextInt();
				System.out.println("立方为："+mathematician.cubeNum(d));
				break;
			case 4:
				System.out.println("请输入一个正整数：");
				int e=input.nextInt();
				System.out.println("累加和为："+mathematician.sumNum(e));
				break;
			default:
				break;
			}
		}
	}
}
