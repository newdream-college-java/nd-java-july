/**
 * 
 * @author 54975
 *计算器
 */
public class Calculator {
	/**
	 * 
	 * @param num1
	 * @param num2
	 */
	double num1;
	double num2;
	/**
	 * 
	 * 相加
	 */
	public void add(double num1,double num2){
		double sum;
		sum=num1+num2;
		System.out.println("相加和为"+sum);
	}
	/**
	 * 
	 *相减
	 * 
	 */
	public void minus(double num1,double num2){
		double sum;
		sum=num1-num2;
		System.out.println("相减差为"+sum);
	}
	/**
	 * 
	 *相乘
	 */
	public void multiple(double num1,double num2){
		double sum;
		sum=num1*num2;
		System.out.println("相乘积为"+sum);
	}
	/**
	 * 相除
	 *
	 */
	public void divide(double num1,double num2){
		double sum;
		sum=num1/num2;
		System.out.println("相除商为"+sum);
	}
	
}
