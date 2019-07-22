package Work;
/**
 * 1.5、 模拟 ATM 机进行账户余额查询
 */
public class Account {
	double money = 1234.5;
	public void findMoney() {
		System.out.println("账户余额为："+money);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		account.findMoney();
	}

}
