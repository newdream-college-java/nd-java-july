
/*
 ���� 10 ��ѧ���ĵ��Ƴɼ�����ɼ��� 60 ������(����)��60~80 ��(�� 60 ���� 80)
 �� 80 ������ ��ѧ�����ж��ٸ�?�������߷֡���ͷֺ�ƽ���� 
 */
import java.util.*;
public class Demo05{
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		double min = 100, max = 0, sum = 0;
		Scanner input = new Scanner(System.in);
		double[] score = new double[10];
		for (int i = 0; i < score.length; i++) {
			System.out.print("��" + (i + 1) + "��ѧ���ĳɼ���");
			score[i] = input.nextDouble();
			if (score[i] > 100 || score[i] < 0) {
				System.out.println("�������󣡣���");
				break;
			}
			max = max > score[i] ? max : score[i];
			min = min < score[i] ? min : score[i];
			if (score[i] >= 80) {
				a++;
			} else if (score[i] >= 60 && score[i] < 80) {
				b++;
			} else {
				c++;
			}
			sum += score[i];
		}
		System.out.println("�ɼ��� 60 ������(����)�У�" + c + "��");
		System.out.println("�ɼ���60~80 ��(�� 60 ���� 80)�У�" + b + "��");
		System.out.println("�ɼ���80 �������У�" + a + "��");
		System.out.println("��ͷ�Ϊ��" + min);
		System.out.println("��߷�Ϊ��" + max);
		System.out.println("ƽ����Ϊ��" + sum / 10);

	}
}