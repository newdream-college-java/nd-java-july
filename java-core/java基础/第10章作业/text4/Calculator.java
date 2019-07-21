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
			System.out.print("请输入第一个整数：");
			num1 = input.nextInt();
			System.out.print("请输入第二个人数：");
			num2 = input.nextInt();
			System.out.print("请输入运算符（+ - * /）：");
			ct = input.next();
			cal();
			System.out.print("是否继续？(y/n)");
			choise = input.next();
		} while (choise.equals("y"));
		System.out.println("计算结束！！！");
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
			System.out.println("目前还不支持这种运算哦！");
		}
		show();
	}
}
