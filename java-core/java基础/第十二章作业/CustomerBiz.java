package chapter12;

import java.util.Scanner;

/*
	创建客户业务类 CustomerBiz,实现客户姓名的添加和显示
*/

public class CustomerBiz {
	Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		String[] name=new String[4];
		CustomerBiz customerBiz=new CustomerBiz();
		customerBiz.addCustomer(name);
		System.out.print("**************************\n");
		System.out.print("********客户姓名列表：**********\n");
		System.out.print("**************************\n");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+"\t");
		}
	}
	public void addCustomer(String[] name) {
		for (int i = 0; i < name.length; i++) {
			System.out.print("请输入客户的姓名：");
			String a =input.next();
			name[i]=a;
			System.out.print("继续输入吗？(y/n):");
			String b=input.next();
			if(b.equals("y")){
				continue;
			}else {
				break;
			}
		}
	}

}
