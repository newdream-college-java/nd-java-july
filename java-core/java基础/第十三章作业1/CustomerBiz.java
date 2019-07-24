package 第十三章作业1;

import java.util.Scanner;

/*1.1、需求说明
创建客户业务类 CustomerBiz,实现客户姓名的添加和显示，如*/
public class CustomerBiz {
	public void addCustomer() {
		Scanner input =new Scanner(System.in);
		String[] cName=new String[4];
		for (int i = 0; i < cName.length; i++) {
			System.out.print("请输入客户的姓名：");
			cName[i]=input.next();
			System.out.print("继续输入吗？（y/n）：");
			String s=input.next();
			if(s.equals("n")){
				System.out.println("****************************************");
				System.out.println("\t\t客户姓名列表");
				System.out.println("****************************************");
				break;				
			}
		}
		for (int i = 0; i < cName.length; i++) {
			System.out.print(cName[i]+"\t");
		}			
		System.out.println();		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerBiz customerBiz=new CustomerBiz();
		customerBiz.addCustomer();
	}
}
