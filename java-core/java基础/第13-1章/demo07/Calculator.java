/*
 1.7、模拟一个简单的购物商贷月供计算器，假设按照以下的公式计算出总利息和每月还款
金 额。总利息=贷款金额*利率;月还款金额=(贷款金额+总利息)/贷款年限
 */
package demo07;

public class Calculator {
	//总利息=贷款金额*利率
	public double zlx(double money,double interest){
		double zlx=money*interest;
		return zlx;
	}
	//月还款金额=(贷款金额+总利息)/贷款年限
	public double monthMoney(double money,int year,double interest){
		double mm=(money+zlx(money,interest))/year;
		return mm;
	}
	
}
