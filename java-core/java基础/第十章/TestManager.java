package 第十章;

import java.util.Scanner;

public class TestManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m1 = new Manager();
		m1.name = "shuaige";
		m1.password = "ls666";
		Manager m2 = new Manager();
		m2.name = "meimei";
		m2.password = "xiao111";
		m1.show();
		m2.show();
		ChangePassword C1 = new ChangePassword();
		C1.changepassword(m1);
	}

}
