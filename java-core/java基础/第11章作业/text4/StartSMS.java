package proJob11.text4;

import java.util.Scanner;

public class StartSMS {
	String name;
	String psw;
	public void loginUI() {
		Scanner sc=new Scanner(System.in);
		System.out.println("��ӭʹ���������ع������ϵͳ");
		System.out.println("1. ��¼ϵͳ");
		System.out.println("2. �˳�");
		System.out.println("**************************");
		System.out.print("��ѡ���������֣�");
		int a=sc.nextInt();
		if(a==1) {
			login();
		}else if(a==2) {
			System.out.println("���˳�");
		}else {
			System.out.print("����������������룺");
			a=sc.nextInt();
		}
	}
	
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.print("�������û�����");
		name=sc.next();
		System.out.print("���������룺");
		psw=sc.next();
	}
	
	public void login() {
		input();
		if(!name.equals("xieqiuxing")||!psw.equals("123456")) {
			System.out.println("��û��Ȩ�޽���ϵͳ�������µ�¼��");
			loginUI();
		}
	}
	
	
}
