/*
 1.7��ģ��һ���򵥵Ĺ����̴��¹������������谴�����µĹ�ʽ���������Ϣ��ÿ�»���
�� �����Ϣ=������*����;�»�����=(������+����Ϣ)/��������
 */
package demo07;

public class Calculator {
	//����Ϣ=������*����
	public double zlx(double money,double interest){
		double zlx=money*interest;
		return zlx;
	}
	//�»�����=(������+����Ϣ)/��������
	public double monthMoney(double money,int year,double interest){
		double mm=(money+zlx(money,interest))/year;
		return mm;
	}
	
}
