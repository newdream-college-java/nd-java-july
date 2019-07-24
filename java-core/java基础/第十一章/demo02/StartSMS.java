/*编写类 StartSMS，实现输入用户名和密码，符合条件的进入系统*/
package demo02;

import java.util.*;

public class StartSMS {
	Scanner input = new Scanner(System.in);

	public void check(Manager gk) {
		while (true) {
			System.out.println("请输入用户名：");
			String userName1 = input.next();
			System.out.println("请输入密码：");
			String passWord1 = input.next();
			if (userName1.equals(gk.userName) && passWord1.equals(gk.passWord)) {
				Menu me = new Menu();
				me.showMainMenu();
			} else {
				System.out.println("@@您没有权限进入系统，请重新登陆@@");
			}
		}
	}

}
