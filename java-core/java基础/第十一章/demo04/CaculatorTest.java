package demo04;

import java.util.Scanner;

public class CaculatorTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Caculator ca=new Caculator();
		System.out.print("������Ҫ��ʲô���㣨��/��/��/������");
		String ysf=input.next();
		if (ysf.equals("��")) {
			ca.add();
		}else if (ysf.equals("��")) {
			ca.minus();
		}else if (ysf.equals("��")) {
			ca.multipele();
		}else if (ysf.equals("��")) {
			ca.divide();
		}else{
			System.out.println("���Ǹ�������");
		}
	}
}
