package Jul22;

import java.util.Scanner;

public class TestAdministrator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Administrator adm1 = new Administrator();
		adm1.name = "admin1";
		adm1.password = "111111";
		Administrator adm2 = new Administrator();
		adm2.name = "admin2";
		adm2.password = "222222";

		adm1.show();
		adm2.show();

		Scanner input = new Scanner(System.in);
		Administrator adm3 = new Administrator();
		System.out.print("请输入用户名：");
	    adm3.name = input.next();
		System.out.print("请输入密码：");
	    adm3.password = input.next();
	    adm3.login();

	}

}
