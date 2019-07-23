package job01.text4;

import java.util.Scanner;

/*模拟银行账户业务：编写 Account 类，添加带参方法实现存款和取款业务，存款初
始 0 元，取款时需要判断余额是否充足，*/
public class Account {
	Scanner scanner=new Scanner(System.in);
	double yue=0;
	
	/**
	 * 选择业务
	 */
	
	public void show(double money) {
		yue+=money;
		System.out.println("1.存款\t2.取款\t0.退出");
		System.out.print("请选择你需要办理的业务：");
		int ans=scanner.nextInt();
		while (ans!=0) {
			switch (ans) {
			case 1:
				yue=deposit(yue);
				break;
			case 2:
				yue=withDraw(yue);
				break;
			default:
				System.out.println("目前没有该业务，请重新输入");
				break;
			}
			System.out.println("1.存款\t2.取款\t0.退出");
			System.out.print("请选择你需要办理的业务：");
			ans=scanner.nextInt();
		}
		System.out.println("谢谢使用！");
		return;
	}
	
	/**
	 * 存钱,初始金额为money
	 */
	public double deposit(double yue) {//money表示初始金额
		System.out.print("请输入存款金额：");
		double deMon=scanner.nextDouble();
		yue+=deMon;
		System.out.println("存款成功");
		System.out.println("***当前余额为："+yue+"元***");
		return yue;
	}
	
	/**
	 * 存钱,初始金额为money
	 */
	public double withDraw(double yue) {
		System.out.print("请输入取款金额：");
		double withMon=scanner.nextDouble();
		if(withMon==0) {
			System.out.println("取款金额不能为0");
			System.out.print("请输入取款金额：");
			withMon=scanner.nextDouble();
		}
		if(yue<withMon) {
			System.out.println("余额不足！");
		}else {
			yue-=withMon;
			System.out.println("取款成功");
			System.out.println("***当前余额为："+yue+"元***");
		}
		return yue;
	}
}
