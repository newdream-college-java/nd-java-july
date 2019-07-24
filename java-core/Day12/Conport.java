/**
	 * 1.7、模拟一个简单的购物商贷月供计算器，假设按照以下的公式计算出总利息和每月还款
金 额。总利息=贷款金额*利率;月还款金额=(贷款金额+总利息)/贷款年限
	 */
public class Conport {
		double sum=0;
	public double getmonth(double a){
		
		sum=a*0.18;
		return sum;
	}
	public double getAlsoMonth(double a,int year){
		double also=0;
		also=(a+sum)/year;
		return also;
	}
}
