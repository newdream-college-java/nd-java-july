package chapter11;

/**
 * @ClassName: DocClass  
    * @Description: 测试文档注释用的类 
    * @author 新梦想IT学院.陈选洪
    * @date 2019年7月23日  
    *    
*/
public class Menu {
	/*
	 * 系统登录界面
	 * */
	public void showLoginMenu(){
		System.out.println("      欢迎使用我行我素购物系统");
		System.out.println("      1、登录系统");
		System.out.println("      2、退出");
		System.out.println("*****************************");
		System.out.print("请选择，输入数字：");
	}
	/*
	 * 主菜单
	 * */
	public void showMainMenu(){
		System.out.println("      欢迎使用我行我素购物系统");
		System.out.println("      1、客户信息管理");
		System.out.println("      2、真情回馈");
		System.out.println("*****************************");
		System.out.println("请选择，输入数字：");
	}
	/*
	 * 用户管理菜单
	 * */
	public void showCustMenu(){
		System.out.println("      欢迎使用我行我素购物系统");
		System.out.println("      1、显示所有客户信息");
		System.out.println("      2、添加客户信息");
		System.out.println("      3、修改客户信息");
		System.out.println("      4、查询客户信息");
		System.out.println("*****************************");
		System.out.println("请选择，输入数字：");
	}
	/*
	 * 回馈菜单
	 * */
	public void showSendMenu(){
		System.out.println("      欢迎使用我行我素购物系统");
		System.out.println("      1、幸运大放送");
		System.out.println("      2、幸运抽奖");
		System.out.println("      3、生日问候");
		System.out.println("*****************************");
		System.out.println("请选择，输入数字：");
	}
}
