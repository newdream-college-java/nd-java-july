package work;

/**
 * 1.7��ģ��һ���򵥵Ĺ����̴��¹������������谴�����µĹ�ʽ���������Ϣ��ÿ�»��� ��
 * �����Ϣ=������*����;�»�����=(������+����Ϣ)/��������
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
		System.out.println("����ϢΪ��"+m.totalMoney(10000.5, 0.05));
		System.out.println("�»�����Ϊ��"+m.monthMoney(10000.5, m.totalMoney(10000.5, 0.05), 10));
	}

}
