import java.util.Scanner;

/*
 �Ա�����ʽ��� 5 �ʹ�����ܽ�� ����һ������Ϊ 5 �� double ���������
�������� ѭ��������ʹ���� ���ۼ��ܽ�� ����ѭ�������ʹ����
�������ܽ�� 
 */
public class Demo02 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("�������Ա���µ����Ѽ�¼");
		double xfs[]=new double[5];
		double sum=0;
		for(int i=0;i<xfs.length;i++){
			System.out.print("�������"+(i+1)+"�ʽ�");
			xfs[i]=input.nextDouble();
			sum+=xfs[i];
		}
		System.out.println("���\t\t���(Ԫ)");
		for(int i=0;i<xfs.length;i++){
			System.out.println((i+1)+"\t\t"+xfs[i]);
		}
		System.out.println("�ܽ��\t\t"+sum);
	}
}
