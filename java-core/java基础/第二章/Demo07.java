/*
дһ�� Pay ��ģ�ʵ���������󣬽���ʱ�û�֧�� 1500 Ԫ����ӡ����СƱ
����˴ι����õĻ�Ա����(ÿ���� 100 Ԫ��� 3 ��) 
*/
import java.util.Scanner;
public class Demo07{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("�������˼���T����");
		int a = input.nextInt();
		System.out.print("�������˼�������Ь��");
		int b = input.nextInt();
		System.out.print("�������˼�˫�����ģ�");
		int c = input.nextInt();

		System.out.println("***************���ѵ�***************");
		System.out.println("������Ʒ"+"����"+"\t"+"����"+"\t"+"���");
		System.out.println("T��"+"\t"+"245"+"\t"+a+"\t"+245*a);
		System.out.println("����Ь"+"\t"+"570"+"\t"+b+"\t"+570*b);
		System.out.println("������"+"\t"+"320"+"\t"+c+"\t"+320*c);
		int sum;
		sum = 245*a+570*b+320*c;
		sum = sum*8/10;
		System.out.println("                                              ");
		System.out.println("�ۿۣ�8��");
		System.out.println("�����ܽ�"+sum);
		System.out.println("ʵ�ʽ��ѣ� 1500");
		int i = 1500-sum;
		System.out.println("��Ǯ"+i);
		System.out.println("���ι�������Ļ����ǣ�"+(sum/100)*3);

	}
}