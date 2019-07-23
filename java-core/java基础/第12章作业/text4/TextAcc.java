package job01.text4;

/*模拟银行账户业务：编写 Account 类，添加带参方法实现存款和取款业务，存款初
始 0 元，取款时需要判断余额是否充足，如*/
import java.util.Scanner;

public class TextAcc {
	public static void main(String[] args) {
		Account account=new Account();
		Scanner scanner=new Scanner(System.in);
		System.out.print("请输入账户初始金额：");
		double money=scanner.nextDouble();
		account.show(money);
	}
}
