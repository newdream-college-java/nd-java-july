package ��ʮ������ҵ1;
/*1.6��дһ����ѧ�ҵ��࣬�����д������ķ�������:	
a)�����������������бȽϣ������������е����ֵ�ķ�����
b)����һ��������������������ĸ�λ���Ǽ��ķ�����
c)����һ��������������������������ķ�����
d)����һ��������������� 1 �ӵ��������ĺ��Ƕ��ٵķ�������������һ�� 5 ��ô�ͼ���
1+2+3+4+5=15����󷵻� 15*/
import java.util.Scanner;

public class Mathematician {

	public int maxNum(int a, int b) {
		return a > b ? a : b;
	}

	public int countNum(int number) {
		return number % 10;
	}

	public int cubeNum(int number) {
		return number * number * number;
	}

	public int sumNum(int number) {
		int sum = 0;
		for (int i = 1; i <=number; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Mathematician mathematician=new Mathematician();
		while (true) {
			System.out.println("0.�˳�ϵͳ 1.�������е����ֵ 2.�������ĸ�λ 3.������������ 4.���1�ۼӵ����������ܺ�");
			System.out.print("��ѡ����Ĳ�����ţ�");
			int n = input.nextInt();
			switch (n) {
			case 0:
				System.out.println("�ɹ��˳�ϵͳ��");
				System.exit(-1);
			case 1:
				System.out.println("�������һ��������");
				int a=input.nextInt();
				System.out.println("������ڶ���������");
				int b=input.nextInt();
				System.out.println("���ֵΪ��"+mathematician.maxNum(a, b));
				break;
			case 2:
				System.out.println("������һ��������");
				int c=input.nextInt();
				System.out.println("��λΪ��"+mathematician.countNum(c));
				break;
			case 3:
				System.out.println("������һ��������");
				int d=input.nextInt();
				System.out.println("����Ϊ��"+mathematician.cubeNum(d));
				break;
			case 4:
				System.out.println("������һ����������");
				int e=input.nextInt();
				System.out.println("�ۼӺ�Ϊ��"+mathematician.sumNum(e));
				break;
			default:
				break;
			}
		}
	}
}
