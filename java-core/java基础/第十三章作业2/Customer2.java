package ��ʮ������ҵ2;

import java.util.Scanner;

/*1.2������˵��
���ʵ����ӿͻ����ͻ���Ϣ����:���������䡢�Ƿ��л�Ա����*/
public class Customer2 {
	String name;
	int age;
	String vipCard;
	
	public void addCustomer(){
		Scanner input=new Scanner(System.in);
		System.out.print("������������");
		name=input.next();
		System.out.print("���������䣺");
		age=input.nextInt();
		System.out.print("�Ƿ��л�Ա����");
		vipCard=input.next();
	}
	
	@Override
	public String toString() {
		return name + "\t" + age + "\t" + vipCard + "\t";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ͻ���Ϣ��");
		Customer2 c1=new Customer2();
		c1.addCustomer();
		Customer2 c2=new Customer2();
		c2.addCustomer();
		System.out.println();
		System.out.println(c1);
		System.out.println(c2);
	}

}
