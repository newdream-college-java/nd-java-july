package 第十章;

import java.util.Scanner;

public class ChangePassword {
	public void changepassword(Manager name) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入用户名：");
		String nowname = input.next();
		System.out.print("请输入密码：");
		String password = input.next();
		if (name.name.equals(nowname) && name.password.equals(password)) {
			System.out.print("请输入新密码：");
			String newPassword = input.next();
			name.password = newPassword;
			System.out.println("修改密码成功，您的新密码为：" + newPassword);
		} else {
			System.out.println("用户名和密码不匹配！您没有权限更新管理员信息");
		}
	}
}
