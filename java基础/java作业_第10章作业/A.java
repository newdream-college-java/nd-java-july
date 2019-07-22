import java.util.*;
public class A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.show();
		A b = new A();
		b.mima();
	}

	public  void show(){
		System.out.println("姓名：admin1,密码：111111");
		System.out.println("姓名：admin2,密码：222222");
	}
	public void mima(){
		Scanner input = new Scanner(System.in);
			System.out.print("请输入用户名：");
			String a = input.next();
			System.out.print("请输入密码：");
			String b = input.next();
			if(a.equals("admin1")&&b.equals("111111")){
				System.out.print("请输入新的密码：");
				String c = input.next();
				System.out.println("修改密码成功，您的新密码为："+c);
			}else if(!a.equals("admin1")||!b.equals("111111")){
				System.out.println("用户名和面膜不匹配！您没有权限更新管理员信息。");
				
			}
	}
}
