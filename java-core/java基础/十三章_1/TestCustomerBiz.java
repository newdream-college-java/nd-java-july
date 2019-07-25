package 十三章_1;

import java.util.Scanner;

public class TestCustomerBiz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerBiz test = new CustomerBiz();
		Scanner input = new Scanner(System.in);
		while (true) {
			test.addCustomer();
			System.out.print("继续输入吗？（y/n）：");
			String a = input.next();
			if (a.equals("n")) {
				break;
			} else if (a.equals("y")) {
				continue;
			} else {
				System.out.println("输入不合法");
				break;
			}
		}
		System.out.println("***************************************");
		System.out.println("\t\t客户姓名列表：");
		System.out.println("***************************************");
		test.show();
		System.out.println();
		System.out.print("请输入要修改的客户姓名：");
		String oldname = input.next();
		System.out.print("请输入新的客户姓名：");
		String newname = input.next();
		test.alterCustomer(oldname, newname);
		System.out.println("*****修改结果*****");
		test.show();

	}

}
