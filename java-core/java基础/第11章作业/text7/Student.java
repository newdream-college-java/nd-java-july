package proJob11.text7;

import java.util.Scanner;

public class Student {
	String name;
	String number;
	String classString;
	String sex;
	int age;
	String address;
	
	
	public void sayHello() {
		inPut();
		System.out.println("������"+name);
		System.out.println("ѧ�ţ�"+number);
		System.out.println("�༶��"+classString);
		System.out.println("�Ա�"+sex);
		System.out.println("���䣺"+age);
		System.out.println("��ͥסַ��"+address);
	}
	
	public void inPut() {
		Scanner input=new Scanner(System.in);
		System.out.print("������������");
		name=input.next();
		System.out.print("������ѧ�ţ�");
		number=input.next();
		System.out.print("������༶��");
		classString=input.next();
		System.out.print("�������Ա�");
		sex=input.next();
		System.out.print("���������䣺");
		age=input.nextInt();
		System.out.print("�������ͥסַ��");
		address=input.next();
	}
	
}
