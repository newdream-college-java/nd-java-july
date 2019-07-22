package 第11章作业;

import java.util.Scanner;

/*1.5、 模拟 ATM 机进行账户余额查询*/
public class ATM {
	double accontBalance=12345.5;
	public double querryBalance() {
		return accontBalance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner inputScanner=new Scanner(System.in);
		double bal=inputScanner.nextDouble();*/
		ATM atm=new ATM();
		//atm.accontBalance=bal;
		System.out.println("账户余额为:"+atm.querryBalance());
	}

}
