import java.util.Arrays;
import java.util.Scanner;

public class Demo04 {

	/**
	 * 1.5������ 10 ��ѧ���ĵ��Ƴɼ�����ɼ��� 60 ������(����)��60~80 �� (�� 60 ���� 80)�� 80 ������
	 * ��ѧ�����ж��ٸ�?�������߷֡���ͷֺ�ƽ����
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * int sum1=0;//60������ int sum2=0;//60<= x <80 int sum3=0;//80������ double
		 * sum=0;//�ܷ��� double min=0;//��Сֵ double max=0;//���ֵ for(int
		 * i=1;i<=10;i++){ System.out.print("�������"+i+"��ͬѧ�ĵ��Ƴɼ�:"); double
		 * data=input.nextDouble(); if(data<60){ if(max>data){ max=data; }
		 * sum1++; }else if(data>80){ sum2++; }else{ if(data>min){ min=data; }
		 * sum3++; } sum++; }
		 * System.out.println("60 ������(����):"+sum1+"\n60~80 ��(�� 60 ���� 80):"
		 * +sum3+"\n80 ������"+sum2);
		 * System.out.println("��߷�:"+min+"��ͷ�:"+max+"ƽ����"+sum/10.0);
		 */
		double[] arr = new double[10];
		int sum1 = 0;// 60������
		int sum2 = 0;// 60<= x <80
		int sum3 = 0;// 80������
		double sum = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print("�������" + i + "��ͬѧ�ĵ��Ƴɼ�:");
			double data = input.nextDouble();
			arr[i] = data;
		}
		Arrays.sort(arr);
		for (int j = 0; j < 10; j++) {
			if (arr[j] < 60) {
				sum1++;
			} else if (arr[j] >= 80) {
				sum3++;
			} else {
				sum2++;
			}
			sum += arr[j];
		}
		System.out.println("60 ������(����):" + sum1 + "\n60~80 ��(�� 60 ���� 80):"
				+ sum3 + "\n80 ������" + sum2);
		System.out.println("��߷�:" + arr[arr.length - 1] + "��ͷ�:" + arr[0]
				+ "ƽ����" + sum / 10.0);
	}

}
