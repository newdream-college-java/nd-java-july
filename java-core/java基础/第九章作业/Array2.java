/*1.2������˵��
�Ա�����ʽ��� 5 �ʹ�����ܽ�� ����һ������Ϊ 5 �� double ���������
�������� ѭ��������ʹ���� ���ۼ��ܽ�� ����ѭ�������ʹ����
�������ܽ��*/
import java.util.*;
public class Array2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("�������Ա���µ����Ѽ�¼��");
		double[] money=new double[5]; 
		for(int i=0;i<money.length;i++){
			System.out.print("�������"+(i+1)+"�ʹ����");
			money[i]=input.nextDouble();
			
		}
		System.out.println();
		double sum=0;
		System.out.println("���\t\t��Ԫ��");	
		for(int i=0;i<money.length;i++){
			sum+=money[i];
			System.out.println((i+1)+"\t\t"+money[i]);
		}
		System.out.println("�ܽ��\t\t"+sum);	
	}
}