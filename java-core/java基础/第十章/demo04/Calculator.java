package Jul22;

/*1.4��ʹ����������˼���дһ����������(Calculator),����ʵ�����������ļӡ�
 �����ˡ��� ���㡣
 */
public class Calculator {
	double num1;
	double num2;
	double num;
	public double calculator(int n) {
		switch (n) {
		case 1:
			num = num1+num2;
			break;
		case 2:
			num = num1-num2;
			break;
		case 3:
			num = num1*num2;
			break;
		case 4:
			num = num1/num2;
		default:
			break;

		}
		return num;
	}
}
