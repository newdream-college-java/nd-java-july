/*7������˵�� 
дһ�� Pay ��ģ�ʵ���������󣬽���ʱ�û�֧�� 1500 Ԫ����ӡ����СƱ 
����˴ι����õĻ�Ա����(ÿ���� 100 Ԫ��� 3 ��)  */
import java.util.Scanner;
public class H{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������ʵ�ʽ��ѣ�");
		int a = input.nextInt();
		int b = a-1104;
		int c = (1104/100)*3;
		System.out.println("********���ѵ�********");
		System.out.println("������Ʒ\t����\t����\t���");
		System.out.println("T��\t\t245\t2\t490");
		System.out.println("����Ь\t\t570\t1\t570");
		System.out.println("������\t\t320\t1\t320\n\n\n");
		System.out.println("�ۿۣ�\t8��");
		System.out.println("�����ܽ��:\t1104.0");
		System.out.println("ʵ�ʽ��ѣ�\t"+a);
		System.out.println("��Ǯ��\t"+b);
		System.out.println("���ι�������õĻ����ǣ�"+c);
}
}