/**
	 * 1.7��ģ��һ���򵥵Ĺ����̴��¹������������谴�����µĹ�ʽ���������Ϣ��ÿ�»���
�� �����Ϣ=������*����;�»�����=(������+����Ϣ)/��������
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
