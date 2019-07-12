import java.util.*;
public class LoginMenu{
	public static void main(String[] args){
		System.out.println("********************************************");
		System.out.println("\t\t欢迎使用我行我素购物管理系统");
		System.out.println();
		System.out.println("\t\t1.登录系统");
		System.out.println();
		System.out.println("\t\t2.退出");
		System.out.println("********************************************");
		System.out.println("请选择，输入数字");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		if(a==1){
			System.out.println("你选择的是登录系统");
			MainMenu m = new MainMenu();
			m.mainMenu();
		}else
			System.out.println("你选择的是退出");
	}
}

