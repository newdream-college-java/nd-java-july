package demo01;

import java.util.Scanner;

public class CustomerBizTes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CustomerBiz cb=new CustomerBiz();
		while (true) {
			System.out.print("请输入客户的姓名：");
			String name=input.next();
			cb.addname(name);
			System.out.print("继续输入吗（y/n）：");
			String choose =input.next();
			if(choose.equals("n")){
				break;
			}
		}
		System.out.println("*************************");
		System.out.println();
		System.out.println("\t客户列表");
		System.out.println("*************************");
		cb.show();
	}
}
