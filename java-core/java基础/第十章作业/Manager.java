package 第10章作业;

/*
 编写管理员类(属性:用户名，密码;方法:show()显示管理员信息)
 创建两个管理员类对象，输出他们的相关信息
 输入旧的用户名和密码，如果正确，才有权限更新
 从键盘上获取新的密码，进行更新
 */
import java.util.*;

;

public class Manager {

	public static void main(String[] args) {
		Admin admin1 = new Admin();
		Admin admin2 = new Admin();
		admin1.用户名 = "admin1";
		admin1.密码 = "111111";
		admin2.用户名 = "admin2";
		admin2.密码 = "222222";
		admin1.show();
		admin2.show();

		Scanner input = new Scanner(System.in);
		System.out.print("请输入用户名：");
		String a = input.next();
		System.out.print("请输入密码：");
		String b = input.next();
		if (a.equals(admin1.用户名) && b.equals(admin1.密码)) {
			System.out.print("请输入新密码：");
			String c = input.next();
			admin1.密码 = c;
			System.out.println("修好密码成功，您的新密码为：" + admin1.密码);
		} else {
			System.out.println("用户名和密码不匹配!您没有权限更新管理员信息");
		}

	}

}
