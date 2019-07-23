package work;

/**
 * 1.7、模拟一个简单的购物商贷月供计算器，假设按照以下的公式计算出总利息和每月还款 金
 * 额。总利息=贷款金额*利率;月还款金额=(贷款金额+总利息)/贷款年限
 */

public class MonthMoney {
	public double totalMoney(double money, double ll) {
		return money * ll;
	}

	public double monthMoney(double money, double totalmoney, int year) {
		return (totalmoney + money) / (year*12);
	}

	public static void main(String[] args) {
		MonthMoney m = new MonthMoney();
		System.out.println("总利息为："+m.totalMoney(10000.5, 0.05));
		System.out.println("月还款金额为："+m.monthMoney(10000.5, m.totalMoney(10000.5, 0.05), 10));
	}

}
