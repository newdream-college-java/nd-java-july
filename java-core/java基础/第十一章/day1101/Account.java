package Work;
/**
 * 1.5�� ģ�� ATM �������˻�����ѯ
 */
public class Account {
	double money = 1234.5;
	public void findMoney() {
		System.out.println("�˻����Ϊ��"+money);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		account.findMoney();
	}

}
