import java.util.Scanner;

public class Menu {
	public void showLoginMenu() {
		System.out.println("\t欢迎使用我行我素购物管理系统\n");
		System.out.println("\t\t\t1.登陆系统");
		System.out.println("\t\t\t2.退出");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您的选项");
		int num=sc.nextInt();
		while(num!=2&&num!=1){
			System.out.println("输入错误，请重新输入");
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
		System.out.println("\t我行我素购物管理系统主菜单\n");
		System.out.println("\t\t\t1.客户信息管理");
		System.out.println("\t\t\t2.真情回馈");
		System.out.println("请输入您的选项");
		int num=sc.nextInt();
		while(num!=2&&num!=1){
			System.out.println("输入错误，请重新输入");
			num=sc.nextInt();
		}
		if(num==1){
			showCustMenu();
		}else {
			showSendMenu();
		}

	}

	public void showCustMenu() {
		System.out.println("\t我行我素购物管理系统>客户信息管理\n");
		System.out.println("\t\t\t1.显示所有客户信息");
		System.out.println("\t\t\t2.添加客户信息");
		System.out.println("\t\t\t3.修改客户信息");
		System.out.println("\t\t\t4.查询客户信息");
		System.out.println("请输入您的选项");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		while(num!=2&&num!=1&&num!=3&&num!=4&&num!=0){
			System.out.println("输入错误，请重新输入");
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
		System.out.println("\t我行我素购物管理系统>真情回馈\n");
		System.out.println("\t\t\t1.幸运大放送");
		System.out.println("\t\t\t2.幸运抽奖");
		System.out.println("\t\t\t3.生日问候");
		System.out.println("请输入您的选项");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		while(num!=2&&num!=1&&num!=3&&num!=0){
			System.out.println("输入错误，请重新输入");
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
