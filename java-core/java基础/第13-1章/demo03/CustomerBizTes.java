package demo03;

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
		System.out.println();
		System.out.println();
		System.out.print("������Ҫ�޸ĵĿͻ�������");
		String name1=input.next();
		cb.xgname(name1);
		System.out.println("*************************");
		System.out.println();
		System.out.println("\t�ͻ��б�");
		System.out.println("*************************");
		cb.show();
	}
}
