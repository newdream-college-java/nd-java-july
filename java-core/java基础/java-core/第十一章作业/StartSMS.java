package chapter_11;

import java.util.Scanner;

public class StartSMS {
	public void showLoginMenu(){
		String a="clc";
		String b = "1234";
		System.out.println("**********************************");
		System.out.println("\t��ӭʹ���������ع���ϵͳ������");
		System.out.println("\t\t1.��¼ϵͳ");
		System.out.println("\t\t2.�˳�");
		Scanner input=new Scanner(System.in);
		System.out.print("��ѡ���������֣�");
		int a1=input.nextInt();
		if(a1==1){
			do{
			System.out.print("�������û�����");
			String userName=input.next();
			System.out.print("���������룺");
			String passWord=input.next();
			if(userName.equals(a)&&passWord.equals(b)){
				System.out.println("@@H��ӭʹ���������ع���ϵͳ��@@");
				break;
			}else{
				System.out.println("@@��û��Ȩ�޽���ϵͳ�������µ�¼��@@");
				continue;
			}
			}while(true);
		}else{
			System.out.println("@@ϵͳ�˳�������@@");
			System.exit(-1);
		}
	}
	public static void main(String[] args) {
		/**
		 * ��������
		 * ���÷���
		 */
		StartSMS menu=new StartSMS();
		menu.showLoginMenu();

	}


}
