package demo01;

import java.util.Scanner;

public class CustomerBizTes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CustomerBiz cb=new CustomerBiz();
		while (true) {
			System.out.print("������ͻ���������");
			String name=input.next();
			cb.addname(name);
			System.out.print("����������y/n����");
			String choose =input.next();
			if(choose.equals("n")){
				break;
			}
		}
		System.out.println("*************************");
		System.out.println();
		System.out.println("\t�ͻ��б�");
		System.out.println("*************************");
		cb.show();
	}
}
