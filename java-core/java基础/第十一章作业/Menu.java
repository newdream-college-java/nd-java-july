import java.util.Scanner;

public class Menu {
	public void showLoginMenu() {
		System.out.println("\t��ӭʹ���������ع������ϵͳ\n");
		System.out.println("\t\t\t1.��½ϵͳ");
		System.out.println("\t\t\t2.�˳�");
		Scanner sc = new Scanner(System.in);
		System.out.println("����������ѡ��");
		int num=sc.nextInt();
		while(num!=2&&num!=1){
			System.out.println("�����������������");
			num=sc.nextInt();
		}
		if(num==1){
			showMainMenu();
		}else {
			return;
		}
	}

	public void showMainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t�������ع������ϵͳ���˵�\n");
		System.out.println("\t\t\t1.�ͻ���Ϣ����");
		System.out.println("\t\t\t2.�������");
		System.out.println("����������ѡ��");
		int num=sc.nextInt();
		while(num!=2&&num!=1){
			System.out.println("�����������������");
			num=sc.nextInt();
		}
		if(num==1){
			showCustMenu();
		}else {
			showSendMenu();
		}

	}

	public void showCustMenu() {
		System.out.println("\t�������ع������ϵͳ>�ͻ���Ϣ����\n");
		System.out.println("\t\t\t1.��ʾ���пͻ���Ϣ");
		System.out.println("\t\t\t2.��ӿͻ���Ϣ");
		System.out.println("\t\t\t3.�޸Ŀͻ���Ϣ");
		System.out.println("\t\t\t4.��ѯ�ͻ���Ϣ");
		System.out.println("����������ѡ��");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		while(num!=2&&num!=1&&num!=3&&num!=4&&num!=0){
			System.out.println("�����������������");
			num=sc.nextInt();
		}
		switch(num){
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			showMainMenu();
		}

	}

	public void showSendMenu() {
		System.out.println("\t�������ع������ϵͳ>�������\n");
		System.out.println("\t\t\t1.���˴����");
		System.out.println("\t\t\t2.���˳齱");
		System.out.println("\t\t\t3.�����ʺ�");
		System.out.println("����������ѡ��");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		while(num!=2&&num!=1&&num!=3&&num!=0){
			System.out.println("�����������������");
			num=sc.nextInt();
		}
		switch(num){
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			showMainMenu();
		}

	}

}
