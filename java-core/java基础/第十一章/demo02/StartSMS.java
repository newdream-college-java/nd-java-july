/*��д�� StartSMS��ʵ�������û��������룬���������Ľ���ϵͳ*/
package demo02;

import java.util.*;

public class StartSMS {
	Scanner input = new Scanner(System.in);

	public void check(Manager gk) {
		while (true) {
			System.out.println("�������û�����");
			String userName1 = input.next();
			System.out.println("���������룺");
			String passWord1 = input.next();
			if (userName1.equals(gk.userName) && passWord1.equals(gk.passWord)) {
				Menu me = new Menu();
				me.showMainMenu();
			} else {
				System.out.println("@@��û��Ȩ�޽���ϵͳ�������µ�½@@");
			}
		}
	}

}
