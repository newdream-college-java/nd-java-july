package ��11����ҵ;

import java.util.Scanner;

/*1.5�� ģ�� ATM �������˻�����ѯ*/
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
		System.out.println("�˻����Ϊ:"+atm.querryBalance());
	}

}
