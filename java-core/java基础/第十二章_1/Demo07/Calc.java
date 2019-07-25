package chapter12_1;

public class Calc {
	public void calcMoney(double money,double rate,double year){
		double allmoney = (money + money*rate)/year;
		System.out.println("月还款应为："+allmoney);
	}

}
