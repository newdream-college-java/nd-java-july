import java.util.Scanner;

//编写类 StartSMS，实现输入用户名和密码，符合条件的进入系统
public class StartSMS {
	public static void main(String[] args) {
		System.out.println("欢迎使用我行我素购物管理系统");
		System.out.println("\t1.登陆系统");
		System.out.println("\t2.退出系统");
		System.out.println("*************************");
		Scanner input=new Scanner(System.in);
		System.out.println("请输入数字:");
		int tase=input.nextInt();
		if(tase==1){
			Manager manager=new Manager();
			System.out.println("请输入用户名：");
			String username=input.next();
			System.out.println("请输入密码：");
			String password=input.next();
			if(manager.test[0].equals(username)&&manager.test[1].equals(password)){
				index inde=new index();
				inde.showLoginMenu();
			}else{
				
				System.out.println("@@您还没有权限进入系统，请重新登陆@@");
			}
		}else{
			System.exit(0);
		}
	}
}
