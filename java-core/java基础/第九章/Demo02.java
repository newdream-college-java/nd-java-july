/*
1.2������˵��  
�Ա�����ʽ��� 5 �ʹ�����ܽ�� ����һ������Ϊ 5 �� double ���������
�������� ѭ��������ʹ���� ���ۼ��ܽ�� ����ѭ�������ʹ����
�������ܽ��  
*/
import java.util.*;
public class Demo02{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		double sum =0;
		double a[]=new double[5];
		System.out.println("�������Ա���µ����Ѽ�¼");
		for(int i =0;i<a.length;i++){
			System.out.print("�������"+(i+1)+"�ʹ����¼��");
			a[i]=input.nextDouble();
			sum+=a[i];
		}
		System.out.println("���\t��Ԫ��");
		for(int i =0;i<a.length;i++){
			System.out.println((i+1)+"\t"+a[i]);
		}
		System.out.print("�ܽ��\t"+sum);
	}
}