package demo04;

import java.util.Scanner;

public class CaculatorTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Caculator ca=new Caculator();
		System.out.print("请输入要做什么运算（加/减/乘/除）：");
		String ysf=input.next();
		if (ysf.equals("加")) {
			ca.add();
		}else if (ysf.equals("减")) {
			ca.minus();
		}else if (ysf.equals("乘")) {
			ca.multipele();
		}else if (ysf.equals("除")) {
			ca.divide();
		}else{
			System.out.println("你是个憨憨！");
		}
	}
}
