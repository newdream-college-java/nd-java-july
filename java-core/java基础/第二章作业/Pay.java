/*дһ�� Pay ��ģ�ʵ���������󣬽���ʱ�û�֧�� 1500 Ԫ����ӡ����СƱ 
����˴ι����õĻ�Ա����(ÿ���� 100 Ԫ��� 3 ��)  */

import java.util.Scanner;

public class Pay{
	public static void main (String [] args){
	System.out.println("*************���ѵ�**************");
	System.out.println("������Ʒ\t����\t����\t���");
	System.out.println("T��\t\t��245\t2\t��490");
	System.out.println("����Ь\t\t��570\t1\t��570");
	System.out.println("������\t\t��320\t1\t��320\n\n");
	System.out.println("�ۿ�:\t\t8��");
	System.out.println("�����ܽ��\t��1104.0");
	System.out.print("ʵ�ʽ���:\t");
	Scanner input =new Scanner(System.in);
	int n=input .nextInt();
	double x=n-1104.0;
	System.out.println("��Ǯ:\t\t��"+x);
	System.out.println("���ι�������Ļ����ǣ�\t"+1104/100*3);
	}
}