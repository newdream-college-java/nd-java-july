package ��ʮ������ҵ2;
/*1.4��дһ����ѧ�ҵ��࣬�����д������ķ�������: 
a)����һ�����ε����飬����������������е���������֮�͵ķ�����
b)����һ�����ε����飬����������������е����ֵ�ķ���*/
import java.util.Scanner;

public class Mathematician {
	public  int  getSum(int[] a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	
	public int getMax(int[] a) {
		int max=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Mathematician m=new Mathematician();
		Scanner input=new Scanner(System.in);
		int[] a=new int[5];
		for (int i = 0; i < a.length; i++) {
			System.out.print("�����������еĵ�"+(i+1)+"������");
			a[i]=input.nextInt();
		}
		System.out.println("����������֮��Ϊ��"+m.getSum(a));
		System.out.println("�������������ֵΪ��"+m.getMax(a));
	}
}
