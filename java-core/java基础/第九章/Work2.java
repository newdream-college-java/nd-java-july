package nine;

import java.util.Scanner;

public class Work2 {

	/**
	 * �Ա�����ʽ��� 5 �ʹ�����ܽ�� ����һ������Ϊ 5 �� double ���������
	 *�������� ѭ��������ʹ���� ���ۼ��ܽ�� ����ѭ�������ʹ����
	 *�������ܽ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a = new double[5];
		double count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("�������Ա���µ����Ѽ�¼");
		for (int i = 0; i < a.length; i++) {

			System.out.print("�������"+(i+1)+"�ʹ����");
			a[i]=sc.nextDouble();
			System.out.println();
			count+=a[i];
		}
		System.out.println("���\t\t\t���(Ԫ)");
		for (int i = 0; i < a.length; i++) {
			System.out.println(i+1+"\t\t\t"+a[i]);
		}
		System.out.println("�ܽ��\t\t\t"+count);
		
	}

}
