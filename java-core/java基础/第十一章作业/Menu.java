package 第11章作业;
/*1.2、需求说明
实现系统菜单、输入菜单编号，可以菜单级联关系与程序运行结果如图:
1.2.1、根据老师提供的素材，观察菜单类 Menu 代码，分析各个方法的功能
showLoginMenu()方法，实现显示登录菜单
showMainMenu()方法，实现显示主菜单
showCustMenu()方法，实现显示客户信息管理菜单
showSendGMenu()方法，实现显示真情回馈菜单
找出 Menu 类中的“代码填空 1”至“代码填空 6”，分别填写完整，实现功能。 编写测
试类 TestMenu，进行验证
*/
import java.util.Scanner;

public class Menu {
	
	public void showLoginMenu() {
		// TODO Auto-generated method stub
		System.out.println("\t欢迎使用我行我素购物管理系统");
		System.out.println("\t\t1.登录系统");
		System.out.println("\t\t2.退出");
		Scanner input=new Scanner(System.in);
		System.out.print("请选择，输入数字：");
		int loginNum=input.nextInt();
		switch(loginNum){
			case 0:
				showLoginMenu();
				break;
			case 1:
				showMainMenu();
				break;
			case 2:
				System.out.println("成功退出系统！");
				System.exit(-1);
				break;
			default:
				System.out.println("输入错误!");		
		}
	}
	
	public void showMainMenu(){
		System.out.println("\t我行我素购物管理系统主菜单");
		System.out.println("\t\t1.客户信息管理");
		System.out.println("\t\t2.真情回馈");
		Scanner input=new Scanner(System.in);
		System.out.print("请选择，输入数字：");
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
			System.out.println("输入错误!");		
		}
	}
	
	public void showCustMenu(){
		System.out.println("\t我行我素购物管理系统>客户信息管理");
		System.out.println("\t\t1.查询客户信息");
		System.out.println("\t\t2.修改客户信息");
		System.out.println("\t\t3.添加客户信息");
		System.out.println("\t\t4.显示所有客户信息");
		Scanner input=new Scanner(System.in);
		System.out.print("请选择，输入数字：");
		int custNum=input.nextInt();
		switch(custNum){
		case 0:
			showMainMenu();
			break;
		case 1:
			System.out.println("执行查询客户信息");
			break;
		case 2:
			System.out.println("执行修改客户");
			break;
		case 3:
			System.out.println("执行添加客户信息");
			break;
		case 4:
			System.out.println("执行显示所有客户信息");
			break;
		default:
			System.out.println("输入错误!");		
		}
	}
	
	public void showSendGtMenu(){
		System.out.println("\t我行我素购物管理系统>真情回馈");
		System.out.println("\t\t1.幸运大放送");
		System.out.println("\t\t2.幸运抽奖");
		System.out.println("\t\t3.生日问候");
		Scanner input=new Scanner(System.in);
		System.out.print("请选择，输入数字：");
		int sendNum=input.nextInt();
		switch(sendNum){
		case 0:
			showMainMenu();
			break;
		case 1:
			System.out.println("执行幸运大放送");
			break;
		case 2:
			System.out.println("执行幸运抽奖");
			break;
		case 3:
			System.out.println("执行生日问候");
		default:
			System.out.println("输入错误!");		
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu mu1=new Menu();
		mu1.showLoginMenu();
	}

}
