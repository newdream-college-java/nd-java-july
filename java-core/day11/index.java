import java.util.Scanner;
public class index {
/*
 * 实现系统菜单、输入菜单编号，可以自由切换各个菜单
菜单级联关系与程序运行结果如图:
 */
	public static void showLoginMenu(){
		//登陆菜单
		System.out.println("欢迎使用我行我素购物管理系统");
		System.out.println("\t1.登陆系统");
		System.out.println("\t2.退出");
		System.out.println("*********************");
		Scanner input=new Scanner(System.in);
		System.out.print("请选择数字:");
		int login=input.nextInt();
		if(login==1){
			MainMenu a=new MainMenu();
			a.showMainMenu();
		}else{
			System.exit(0);
		}
	}
}
