package ��ʮ������ҵ1;

import java.util.Scanner;

/*1.1������˵��
�����ͻ�ҵ���� CustomerBiz,ʵ�ֿͻ���������Ӻ���ʾ����*/
public class CustomerBiz {
	public void addCustomer() {
		Scanner input =new Scanner(System.in);
		String[] cName=new String[4];
		for (int i = 0; i < cName.length; i++) {
			System.out.print("������ͻ���������");
			cName[i]=input.next();
			System.out.print("���������𣿣�y/n����");
			String s=input.next();
			if(s.equals("n")){
				System.out.println("****************************************");
				System.out.println("\t\t�ͻ������б�");
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
