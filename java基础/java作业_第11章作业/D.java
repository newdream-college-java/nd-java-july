import java.util.Scanner;


public class D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D p = new D();
		p.show();
	}
	public void show(){
		System.out.println("欢迎使用我行我素购物管理系统");
		System.out.println("1、登录系统");
		System.out.println("2、退出");
		System.out.println("*******************************************");
		System.out.print("请选择，输入数字：");
		Scanner input =new Scanner(System.in);
		int a = input.nextInt();
		if(a==1){
			System.out.print("请输入用户名：");
			String b = input.next();
			System.out.print("请输入密码：");
			int c = input.nextInt();
			if(b.equals("newdream")&&c==0000){
				C d = new C();
				d.ShowMainMenu();
			}else {
				System.out.println("@@您没有权限进入系统请重新登录！@@");
				D g = new D();
				g.show();
			}
		}else {
			System.exit(-1);
		}
	}
}
