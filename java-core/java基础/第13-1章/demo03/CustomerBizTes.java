package demo03;

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
		System.out.println();
		System.out.println();
		System.out.print("请输入要修改的客户姓名：");
		String name1=input.next();
		cb.xgname(name1);
		System.out.println("*************************");
		System.out.println();
		System.out.println("\t客户列表");
		System.out.println("*************************");
		cb.show();
	}
}
