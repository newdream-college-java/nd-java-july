/*1.2�Ա�����ʽ��� 5 �ʹ�����ܽ�� ����һ������Ϊ 5 �� double ��������洢������ ѭ��������ʹ���� ���ۼ��ܽ�� ����ѭ�������ʹ�����������ܽ��*/
import java.util.*;
public class Work02{
	public static void main(String[] args ){
		Scanner in=new Scanner(System.in);
		System.out.println("�������Ա���µ����Ѽ�¼");
		double[] p=new double[5];
		double sum=0;
		for(int i=0;i<5;i++){
			System.out.print("�������"+(i+1)+"�ʹ����");
			p[i]=in.nextDouble();
			sum+=p[i];
		}
		System.out.println();
		System.out.println("���\t��Ԫ��");
		for(int i=0;i<5;i++){
			System.out.print(i+1+"\t"+p[i]+"\n");
		}
		System.out.println("�ܽ��\t"+sum);
	}
}