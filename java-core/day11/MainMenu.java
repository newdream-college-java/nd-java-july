import java.util.Scanner;

//���ˆ�

public class MainMenu {
	public void showMainMenu() {
		System.out.println("�������ع������ϵͳ���˵�");
		System.out.println("***************************\n\n");
		System.out.println("\t1.�ͻ���Ϣ����");
		System.out.println("\t2.�������");
		System.out.println("***************************");
		System.out.println("��ѡ���������ֻ�0������һ���˵�:");
		Scanner input = new Scanner(System.in);
		int data = input.nextInt();
		if (data == 1) {
			System.out.println("��ӭ����ͻ���Ϣ����");
		} else if (data == 2) {
			CustMenu cust = new CustMenu();
			cust.showCustMenu();
		} else if (data == 0) {
			index mana = new index();
			mana.showLoginMenu();
		} else {
			System.exit(0);
		}
	}
}
