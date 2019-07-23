import java.util.*;


public class C {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.ShowLoginMenu();
	}
	public void ShowLoginMenu(){
		System.out.println("欢迎使用我行我素购物管理系统");
		System.out.println("1、登录系统");
		System.out.println("2、退出");
		System.out.println("*******************************************");
		System.out.print("请选择，输入数字：");
		Scanner input =new Scanner(System.in);
		int a = input.nextInt();
		if(a==1){
			C c = new C();
		c.ShowMainMenu();	
		}else{
			System.exit(-1);
		}
	}
	public void ShowMainMenu(){
		System.out.println("我行我素购物管理系统主菜单");
		System.out.println("*******************************************");
		System.out.println("1、客户信息管理");
		System.out.println("2、真情回馈");
		System.out.println("*******************************************");
		System.out.print("请选择，输入数字或按0返回上一级菜单：");
		Scanner input =new Scanner(System.in);
		int b = input.nextInt();
		if(b==2){
			C c= new C();
			c.ShowSendGMenu();
		}else if(b==1){
			C c= new C();
			c.ShowCustMenu();
		}
	}
	public void ShowCustMenu(){
		System.out.println("我行我素购物客户信息管理菜单");
		System.out.println("客户用户名为：newdream\t密码为：0000");
	}
	public void ShowSendGMenu(){
		System.out.println("我行我素购物管理系统>真情回馈");
		System.out.println("*******************************************");
		System.out.println("1、幸运大放送");
		System.out.println("2、幸运抽奖");
		System.out.println("3、生日问候");
		System.out.println("*******************************************");
		System.out.print("请选择，输入数字或按0返回上一级菜单：");
		Scanner input =new Scanner(System.in);
		int c = input.nextInt();
		switch(c){
		case 1:
			System.out.println("执行幸运大放送");
			break;
		case 2:
			System.out.println("执行幸运抽奖");
			break;
		case 3:
			System.out.println("执行生日问候");
			break;
		}
	}
}
