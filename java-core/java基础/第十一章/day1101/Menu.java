package Work;

import java.util.Scanner;


/**
 * 1.2������˵��
	ʵ��ϵͳ�˵�������˵���ţ����������л������˵�
	1.2.1��������ʦ�ṩ���زģ��۲�˵��� Menu ���룬�������������Ĺ���
	1.2.3����д�� StartSMS��ʵ�������û��������룬���������Ľ���ϵͳ
 */

public class Menu {
	Scanner scanner = new Scanner(System.in);
	public boolean loginCheck() {
		System.out.print("�������û�����");
		String a = scanner.next();
		System.out.println("���������룺");
		int b = scanner.nextInt();
		if (a.equals("admin")) {
			if(b==1234){
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	//��½����
	public void showLoginMenu() {
		System.out.println("��ӭʹ���������ع������ϵͳ");
		System.out.println("\t\t1.��¼ϵͳ");
		System.out.println("\t\t2.�˳�");
		System.out.println("*************************************************");
		System.out.print("��ѡ���������֣�");
		int a = scanner.nextInt();
		switch (a) {
		case 1:
			if (loginCheck()) {
				showMainMenu();
			}else {
			System.out.println("��û��Ȩ�޽���ϵͳ�������µ�¼��");
			}
			break;
			
		case 2:
			System.out.println("�˳�ϵͳ��");
			System.exit(-1);
			break;
			
		default:
			System.out.println("���������������");
			showLoginMenu();
			break;
		}		
	}
	//���˵�
	public void showMainMenu() {
		System.out.println("��ӭʹ���������ع������ϵͳ");
		System.out.println("*************************************************\n");
		System.out.println("\t\t1.�ͻ���Ϣ����");
		System.out.println("\t\t2.�������\n");
		System.out.println("*************************************************");
		System.out.print("��ѡ���������֣�");
		int a = scanner.nextInt();
		switch (a) {
		case 1:
			showCustMenu();
			break;
		case 2:
			showSendGMenu();
			break;
			
		default:
			break;
		}	
	}
	//�������
	public void showSendGMenu() {
		System.out.println("��ӭʹ���������ع������ϵͳ");
		System.out.println("\t�������ع������ϵͳ>�������");
		System.out.println("*************************************************\n");
		System.out.println("\t\t0.������һ��");
		System.out.println("\t\t1.���˴����");
		System.out.println("\t\t2.���˳齱");
		System.out.println("\t\t3.�����ʺ�");
		
		System.out.print("��ѡ���������֣�");
		int a = scanner.nextInt();
		switch (a) {
		case 0:
			showMainMenu();
			break;
		case 1:
			
			break;
		case 2:
		
			break;
			
		default:
			System.out.println("����������������룡");
			showSendGMenu();
			break;
		}	
	}
	//�ͻ���Ϣ����
	public void showCustMenu() {
		System.out.println("\t\t0.������һ��");
		System.out.println("\t\t1.��ʾ���пͻ���Ϣ");
		System.out.println("\t\t2.��ӿͻ���Ϣ");
		System.out.println("\t\t3.�޸Ŀͻ���Ϣ");
		System.out.println("\t\t4.��ѯ�ͻ���Ϣ");
		System.out.println("��ѡ�������룺");
		int a = scanner.nextInt();
		switch (a) {
		case 0:
			showMainMenu();
			break;
		case 1:
			System.out.println("ִ����ʾ���пͻ���Ϣ");
			break;
		case 2:
			System.out.println("ִ����ӿͻ���Ϣ");
			break;
		case 3:
			System.out.println("ִ���޸Ŀͻ���Ϣ");
			break;
		case 4:
			System.out.println("ִ�в�ѯ�ͻ���Ϣ");
			break;

		default:
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu = new Menu();
		menu.showLoginMenu();

	}

}
