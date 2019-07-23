import java.util.Scanner;

//主菜單

public class MainMenu {
	public void showMainMenu() {
		System.out.println("我行我素购物管理系统主菜单");
		System.out.println("***************************\n\n");
		System.out.println("\t1.客户信息管理");
		System.out.println("\t2.真情回馈");
		System.out.println("***************************");
		System.out.println("请选择，输入数字或0返回上一级菜单:");
		Scanner input = new Scanner(System.in);
		int data = input.nextInt();
		if (data == 1) {
			System.out.println("欢迎进入客户信息管理");
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
