package ��11����ҵ;

import java.util.Scanner;

/*1.2.3����д�� StartSMS��ʵ�������û��������룬���������Ľ���ϵͳ*/
public class StartSMS {
	Menu menu=new Menu();
	public void LoginMenu() {
		System.out.println("\t��ӭʹ���������ع������ϵͳ");
		System.out.println("\t\t1.��¼ϵͳ");
		System.out.println("\t\t2.�˳�");
		Scanner input=new Scanner(System.in);
		System.out.print("��ѡ���������֣�");
		int loginNum=input.nextInt();
	}
	String userName="����";
	String passWord="1234";
	public void Login(){
		LoginMenu();
		Scanner input=new Scanner(System.in);
		System.out.print("�������û�����");
		String s1=input.next();
		System.out.print("���������룺");
		String s2=input.next();
		if (userName.equals(s1)&&passWord.equals(s2)) {
			System.out.println("��¼�ɹ���");
			menu.showMainMenu();
		}else{
			System.out.println("@@��û��Ȩ�޽���ϵͳ�������µ�¼��@@");
		}
		
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StartSMS ss=new StartSMS();
		ss.Login();
	}

}
