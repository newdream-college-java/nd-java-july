/*
�Ա�����ʽ��� 5 �ʹ�����ܽ�� ����һ������Ϊ 5 �� double ���������
�������� ѭ��������ʹ���� ���ۼ��ܽ�� ����ѭ�������ʹ����
�������ܽ��
*/
import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�������Ա���µ����Ѽ�¼");
		double[] arr = new double[5];
		double sum = 0;
		for(int i = 0;i<arr.length;i++){
			System.out.print("�������"+(i+1)+"�ʹ����");
			arr[i] = input.nextDouble();
			sum+=arr[i];
		}
		System.out.println();
		System.out.println("���\t"+"��Ԫ��");
		for(int i =0;i<arr.length;i++){
			System.out.println((i+1)+"\t"+arr[i]);
		}
		System.out.println("�ܽ��\t"+sum);
	}
}