package ��11����ҵ;
/*1.2������˵��
ʵ��ϵͳ�˵�������˵���ţ����Բ˵�������ϵ��������н����ͼ:
1.2.1��������ʦ�ṩ���زģ��۲�˵��� Menu ���룬�������������Ĺ���
showLoginMenu()������ʵ����ʾ��¼�˵�
showMainMenu()������ʵ����ʾ���˵�
showCustMenu()������ʵ����ʾ�ͻ���Ϣ����˵�
showSendGMenu()������ʵ����ʾ��������˵�
�ҳ� Menu ���еġ�������� 1������������� 6�����ֱ���д������ʵ�ֹ��ܡ� ��д��
���� TestMenu��������֤
*/
import java.util.Scanner;

public class Menu {
	
	public void showLoginMenu() {
		// TODO Auto-generated method stub
		System.out.println("\t��ӭʹ���������ع������ϵͳ");
		System.out.println("\t\t1.��¼ϵͳ");
		System.out.println("\t\t2.�˳�");
		Scanner input=new Scanner(System.in);
		System.out.print("��ѡ���������֣�");
		int loginNum=input.nextInt();
		switch(loginNum){
			case 0:
				showLoginMenu();
				break;
			case 1:
				showMainMenu();
				break;
			case 2:
				System.out.println("�ɹ��˳�ϵͳ��");
				System.exit(-1);
				break;
			default:
				System.out.println("�������!");		
		}
	}
	
	public void showMainMenu(){
		System.out.println("\t�������ع������ϵͳ���˵�");
		System.out.println("\t\t1.�ͻ���Ϣ����");
		System.out.println("\t\t2.�������");
		Scanner input=new Scanner(System.in);
		System.out.print("��ѡ���������֣�");
		int mainNum=input.nextInt();
		switch(mainNum){
		case 0:
			showLoginMenu();
			break;
		case 1:
			showCustMenu();
			break;
		case 2:
			showSendGtMenu();
			break;
		default:
			System.out.println("�������!");		
		}
	}
	
	public void showCustMenu(){
		System.out.println("\t�������ع������ϵͳ>�ͻ���Ϣ����");
		System.out.println("\t\t1.��ѯ�ͻ���Ϣ");
		System.out.println("\t\t2.�޸Ŀͻ���Ϣ");
		System.out.println("\t\t3.��ӿͻ���Ϣ");
		System.out.println("\t\t4.��ʾ���пͻ���Ϣ");
		Scanner input=new Scanner(System.in);
		System.out.print("��ѡ���������֣�");
		int custNum=input.nextInt();
		switch(custNum){
		case 0:
			showMainMenu();
			break;
		case 1:
			System.out.println("ִ�в�ѯ�ͻ���Ϣ");
			break;
		case 2:
			System.out.println("ִ���޸Ŀͻ�");
			break;
		case 3:
			System.out.println("ִ����ӿͻ���Ϣ");
			break;
		case 4:
			System.out.println("ִ����ʾ���пͻ���Ϣ");
			break;
		default:
			System.out.println("�������!");		
		}
	}
	
	public void showSendGtMenu(){
		System.out.println("\t�������ع������ϵͳ>�������");
		System.out.println("\t\t1.���˴����");
		System.out.println("\t\t2.���˳齱");
		System.out.println("\t\t3.�����ʺ�");
		Scanner input=new Scanner(System.in);
		System.out.print("��ѡ���������֣�");
		int sendNum=input.nextInt();
		switch(sendNum){
		case 0:
			showMainMenu();
			break;
		case 1:
			System.out.println("ִ�����˴����");
			break;
		case 2:
			System.out.println("ִ�����˳齱");
			break;
		case 3:
			System.out.println("ִ�������ʺ�");
		default:
			System.out.println("�������!");		
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu mu1=new Menu();
		mu1.showLoginMenu();
	}

}
