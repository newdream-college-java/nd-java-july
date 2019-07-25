package 十三章_1;

import java.util.Arrays;
import java.util.Scanner;

public class CustomerBiz {
	String[] name = new String[50];
	int count = 0;

	public void addCustomer() {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入客户的姓名：");
		String newName = input.next();
		name[count] = newName;
		count++;
	}

	public void alterCustomer(String oldname, String newname) {
		boolean flag = false;
		for (int i = 0; i < count; i++) {
			if (name[i].equals(oldname)) {
				name[i] = newname;
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("查无此人");
		} else {
			System.out.println("找到并修改成功！");
		}
	}

	public void show() {
		for (int i = 0; i < count; i++) {
			System.out.print(name[i] + "\t");
		}
	}

}
