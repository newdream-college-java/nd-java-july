package 第十三章作业1;

import java.util.Scanner;

/*1.4、需求说明
模拟银行账户业务：编写 Account 类，添加带参方法实现存款和取款业务，存款初
始 0 元，取款时需要判断余额是否充足，
*/


public class Account {
	
	double total=0;
	public void saveMoney(double money) {
		System.out.println("存款成功");
		total+=money;
		System.out.println("当前余额为："+total);
		
	}
	public void getMoney(double money) {
		if (total<money) {
			System.out.println("余额不足");
		}else {
			System.out.println("取款成功");
			total-=money;
			System.out.println("当前余额为："+total);
		}
	}
	
	public static void main(String[] args) {		
		Scanner input=new Scanner(System.in);
		Account account=new Account();
		while(true){
			System.out.println("1.存款2.取款0.退出");
			System.out.print("请选择你要办理的业务：");
			int n=input.nextInt();
			switch (n) {
			case 0:
				System.out.println("谢谢使用！");
				System.exit(-1);
			case 1:
				System.out.print("请输入存款金额：");
				double money1=input.nextDouble();
				account.saveMoney(money1);
				break;
			case 2:
				System.out.print("请输入取款金额：");
				double money2=input.nextDouble();
				account.getMoney(money2);
				break;
	
			default:
				break;
			}
		}
	}
}
