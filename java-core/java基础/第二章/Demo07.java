/*
7������˵�� 
дһ�� Pay ��ģ�ʵ���������󣬽���ʱ�û�֧�� 1500 Ԫ����ӡ����СƱ 
����˴ι����õĻ�Ա����(ÿ���� 100 Ԫ��� 3 ��)  
*/
import java.util.Scanner;
public class Demo07{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�����������ܽ�");
		double price = input.nextDouble();
		System.out.println("*******���ѵ�*******");
		System.out.println("������Ʒ\t����\t����\t���");
		System.out.println("T��\t\t��245\t2\t��490");
		System.out.println("����Ь\t\t��570\t1\t��570");
		System.out.println("������\t\t��320\t1\t��320");
		System.out.println();
		System.out.println("�ۿۣ�\t\t8��");
		System.out.println("�����ܽ��\t��"+price);
		System.out.println("ʵ�ʽ���\t��1500");
		System.out.println("��Ǯ\t\t��396.0");
		System.out.println("���ι�������Ļ����ǣ�\t"+(int)price/100*3);
	}
}