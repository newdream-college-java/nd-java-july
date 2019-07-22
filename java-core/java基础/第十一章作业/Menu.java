package Chapter11_类的无参方法;

/*
 实现系统菜单、输入菜单编号，可以自由切换各个菜单
 */
import java.util.*;

public class Menu {

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.me();

	}

	public void me() {
		System.out.println("*********************************");
		System.out.println("欢迎来使用我行我素购物管理系统\n");
		System.out.println("\t1.登陆系统\n");
		System.out.println("\t2.退出\n");
		System.out.println("*********************************");
		System.out.print("请选择，输入数字：");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch (num) {
		case 1:
			mainMenu();
			break;
		case 2:
			System.out.println("系统退出！！！");
			System.exit(-1);
		default:
			System.out.println("输入错误！！！");
		}
	}

	public void mainMenu() {
		System.out.println("*********************************");
		System.out.println("我行我素购物管理系统主菜单\n");
		System.out.println("\t1.客户信息管理\n");
		System.out.println("\t2.真情回馈\n");
		System.out.println("*********************************");
		System.out.print("请选择，输入数字或按0返回上一级菜单：");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch (num) {
		case 0:
			me();
		case 1:
			System.out.println("欢迎使用客户信息管理界面。");
			break;
		case 2:
			trueFeedback();
		default:
			System.out.println("输入错误！！！");
		}
	}

	public void trueFeedback() {
		System.out.println("*********************************");
		System.out.println("我行我素购物管理系统->真情回馈\n");
		System.out.println("\t1.幸运大放送\n");
		System.out.println("\t2.幸运抽奖\n");
		System.out.println("\t3.生日问候\n");
		System.out.println("*********************************");
		System.out.print("请选择，输入数字或按0返回上一级菜单：");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch (num) {
		case 0:
			mainMenu();
		case 1:
			System.out.println("执行幸运大放送。");
			break;
		case 2:
			System.out.println("执行幸运抽奖。");
			break;
		case 3:
			System.out.println("执行生日问候。");
		default:
			System.out.println("输入错误！！！");
		}
	}

}
