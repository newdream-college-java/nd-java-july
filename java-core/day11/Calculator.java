/**
 * 
 * @author 54975
 *������
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
	 * ���
	 */
	public void add(double num1,double num2){
		double sum;
		sum=num1+num2;
		System.out.println("��Ӻ�Ϊ"+sum);
	}
	/**
	 * 
	 *���
	 * 
	 */
	public void minus(double num1,double num2){
		double sum;
		sum=num1-num2;
		System.out.println("�����Ϊ"+sum);
	}
	/**
	 * 
	 *���
	 */
	public void multiple(double num1,double num2){
		double sum;
		sum=num1*num2;
		System.out.println("��˻�Ϊ"+sum);
	}
	/**
	 * ���
	 *
	 */
	public void divide(double num1,double num2){
		double sum;
		sum=num1/num2;
		System.out.println("�����Ϊ"+sum);
	}
	
}
