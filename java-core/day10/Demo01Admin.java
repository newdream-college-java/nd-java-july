import java.util.Scanner;

public class Demo01Admin {
	public static void main(String[] args) {
		// 创建两个管理员类对象，输出他们的相关信息
		Domo01 domo = new Domo01();
		domo.userName = "admin1";
		domo.passWord = "111111";
		Domo01.show(domo);
		Domo01 domo2 = new Domo01();
		domo2.userName = "admin2";
		domo2.passWord = "222222";
		domo2.show();
		// 输入旧的用户名和密码，如果正确，才有权限更新
		// 从键盘上获取新的密码，进行更新
		Scanner input = new Scanner(System.in);
		System.out.print("请输入用户名:");
		String user = input.next();
		System.out.print("请输入密码:");
		String password = input.next();
		if (user.equals(domo.userName) || password.equals(domo.passWord)) {
			System.out.print("请输入新密码:");
			domo.passWord = input.next();
			System.out.println("修改成功，您的新密码为:" + domo.passWord);
		} else {
			System.out.println("用户名和密码不匹配！您没有权限更新管理员信息。");
		}
	}
}
