package text4.praJob10;

import java.util.Scanner;

public class Calculator {
	Scanner input=new Scanner(System.in);
	int num1;
	int num2;
	int sum;
	String ct;
	String choise;
	
	public void shuRu() {
		do {
			System.out.print("�������һ��������");
			num1 = input.nextInt();
			System.out.print("������ڶ���������");
			num2 = input.nextInt();
			System.out.print("�������������+ - * /����");
			ct = input.next();
			cal();
			System.out.print("�Ƿ������(y/n)");
			choise = input.next();
		} while (choise.equals("y"));
		System.out.println("�������������");
	}

	public void show() {
		System.out.println(num1+ct+num2+"="+sum);
	}
	
	public void cal() {
		sum=0;
		if(ct.equals("+")) {
			sum=num1+num2;
		}else if (ct.equals("-")) {
			sum=num1-num2;
		}else if(ct.equals("*")) {
			sum=num1*num2;
		}else if(ct.equals("/")){
			sum=num1/num2;
		}else {
			System.out.println("Ŀǰ����֧����������Ŷ��");
		}
		show();
	}
}
