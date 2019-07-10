import java.util.*;
public class MainMenu{
	public void mainMenu(){
		System.out.println("\t\t欢迎使用我行我素购物管理系统");
		System.out.println();
		System.out.println("**********************************************");
		System.out.println();
		System.out.println("\t\t1.客户信息管理");
		System.out.println();
		System.out.println("\t\t2.购物结算");
		System.out.println();
		System.out.println("\t\t3.真情回馈");
		System.out.println();
		System.out.println("\t\t4.注销");
		System.out.println("**********************************************");
		System.out.println("请选择，输入数字");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		if(a==1){
			System.out.println("你选择的是客户信息管理");
		}else if(a==2)
			System.out.println("你选择的是购物结算");
		else if(a==3)
			System.out.println("你选择的是真情回馈");
		else 
			System.out.println("你选择的是注销");
	}
}
