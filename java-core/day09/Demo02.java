import java.util.Scanner;

public class Demo02 {

	/**
	 * �Ա�����ʽ��� 5 �ʹ�����ܽ�� ����һ������Ϊ 5 �� double ��������� �������� ѭ��������ʹ���� ���ۼ��ܽ��
	 * ����ѭ�������ʹ���� �������ܽ��
	 */
	public static void main(String[] args) {
		System.out.println("�������Ա���µ����Ѽ�¼");
		Scanner input = new Scanner(System.in);
		double sum = 0;
		double[] index = new double[5];
		for (int i = 1; i <= 5; i++) {
			System.out.print("�������" + i + "�ʹ����");
			double data = input.nextDouble();
			index[i - 1] = data;
			sum += data;

		}
		System.out.println("���\t\t���");
		for (int j = 0; j < index.length; j++) {
			System.out.println(j + 1 + "\t\t" + index[j]);
		}
		System.out.println("�ܽ��\t\t" + sum);
	}

}
