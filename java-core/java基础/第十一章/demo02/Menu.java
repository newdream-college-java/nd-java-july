/*实现系统菜单、输入菜单编号，可以自由切换各个菜单*/
package demo02;
/**
 * @ClassName:DocClass
 * @Description:测试文档注释用的类
 * @author 袁坤
 * @date 2019年7月23日
 */
import java.util.*;
public class Menu {
	Scanner input=new Scanner(System.in);
	Manager gk=new Manager();
	StartSMS ms=new StartSMS();
	/**
	 * 登陆界面的方法
	 */
	//登陆界面
	public void showLoginMenu() {
		System.out.println();
		System.out.println();
		System.out.println("欢迎使用我行我素购物管理系统");
		System.out.println("1.登陆系统");
		System.out.println("2.退出");
		System.out.println("**************************************");
		System.out.print("请选择，输入数字：");
		int xz=input.nextInt();
		switch(xz){
		case 1:
			ms.check(gk);
			break;
		case 2:
			System.out.println("程序已退出！");
			break;
		}
	}
	/**
	 * 主菜单的方法
	 */
	//主菜单
	public void showMainMenu() {
		System.out.println();
		System.out.println();
		System.out.println("我行我素购物管理系统主菜单");
		System.out.println("**************************************");
		System.out.println("1.客户信息管理");
		System.out.println("2.真情回馈");
		System.out.println("**************************************");
		System.out.print("请选择，输入数字或按0返回上一级菜单：");
		int xz=input.nextInt();
		switch(xz){
		case 1:
			showCustMenu();
			break;
		case 2:
			showSendGMenu();
			break;
		case 0:
			showLoginMenu();
			break;
		}
	}
	/**
	 * 客户信息管理的方法
	 */
	//客户信息管理
	public void showCustMenu() {
		System.out.println();
		System.out.println();
		System.out.println("我行我素购物管理系统>客户信息管理");
		System.out.println("**************************************");
		System.out.println("1.查询客户信息");
		System.out.println("2.修改客户信息");
		System.out.println("3.添加客户信息");
		System.out.println("4.显示所有客户信息");
		System.out.println("**************************************");
		System.out.print("请选择，输入数字或按0返回上一级菜单：");
		int xz=input.nextInt();
		switch(xz){
		case 1:
			System.out.println("执行查询客户信息");
			break;
		case 2:
			System.out.println("执行修改客户信息");
			break;
		case 3:
			System.out.println("执行添加客户信息");
			break;
		case 4:
			System.out.println("执行显示所有客户信息");
			break;
		case 0:
			showMainMenu();
			break;
		}
	}
	/**
	 * 真情回馈的方法
	 */
	//真情回馈
	public void showSendGMenu() {
		System.out.println();
		System.out.println();
		System.out.println("我行我素购物管理系统>真情回馈");
		System.out.println("**************************************");
		System.out.println("1.幸运大放送");
		System.out.println("2.幸运抽奖");
		System.out.println("3.生日问候");
		System.out.println("**************************************");
		System.out.print("请选择，输入数字或按0返回上一级菜单：");
		int xz=input.nextInt();
		switch(xz){
		case 1:
			System.out.println("执行幸运大放送");
			break;
		case 2:
			System.out.println("执行幸运抽奖");
			break;
		case 3:
			System.out.println("执行生日问候");
			break;
		case 0:
			showMainMenu();
			break;
		}
	}
}
