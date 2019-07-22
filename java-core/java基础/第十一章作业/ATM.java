package Chapter11_类的无参方法;

/*
	模拟 ATM 机进行账户余额查询
*/

public class ATM {

	public static void main(String[] args) {
		Account account=new Account();
		System.out.println(account.inquire());
	}

}
