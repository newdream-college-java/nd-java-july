/*7������˵��
дһ�� Pay ��ģ�ʵ���������󣬽���ʱ�û�֧�� 1500 Ԫ����ӡ����СƱ
����˴ι����õĻ�Ա����(ÿ���� 100 Ԫ��� 3 ��)*/
import java.util.Scanner;
public class demo07{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("���빺��T��������:");
		int a1=input.nextInt();
		System.out.println("���빺������Ь������:");
		int a2=input.nextInt();
		System.out.println("���빺�������ĵ�����:");
		int a3=input.nextInt();
		System.out.println("����ɷѽ��:");
		int b=input.nextInt();
		int sum=245*a1+570*a2+320*a3;
		int jifen=sum*4/5/100*3;
		System.out.println("��������*���ѵ�*��������");
		System.out.println("������Ʒ\t����\t����\t���");
		System.out.println("T��\t\t245\t"+a1+"\t"+245*a1);
		System.out.println("����Ь\t\t570\t"+a2+"\t"+570*a2);
		System.out.println("������\t\t320\t"+a3+"\t"+320*a3);
		System.out.println("");
		System.out.println("");
		System.out.println("�ۿۣ�"+"\t\t"+"8��");
		System.out.println("�����ܽ��\t"+sum*0.8);
		System.out.println("ʵ�ʽɷ�\t"+b);
		System.out.println("��Ǯ\t\t"+(b-sum*0.8));
		System.out.println("��������õĻ����ǣ�"+jifen);	
	}
}