package nine;

import java.util.Scanner;

public class Work5 {

	/**
	 * 1.5������ 10 ��ѧ���ĵ��Ƴɼ�����ɼ��� 60 ������(����)��60~80 ��(�� 60 ���� 80)
	 *	�� 80 ������ ��ѧ�����ж��ٸ�?�������߷֡���ͷֺ�ƽ����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a = new double[10];
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		double sum = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.print("�������"+(i+1)+"��ѧ���ĳɼ���");
			a[i] = sc.nextDouble();
			if(a[i]>=80){
				count1++;
			}else if (a[i]>=60) {
				count2++;
			}else {
				count3++;
			}
			sum+=a[i];
		}
		System.out.print("80�����ϵ���"+count1+"��\t60~80�ֵ���"+count2+"��\t����60�ֵ���"+count3+"��\n");
		System.out.println("ƽ����Ϊ��"+sum/a.length);
	}

}
