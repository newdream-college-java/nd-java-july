/*7������˵��дһ�� Pay ��ģ�ʵ���������󣬽���ʱ�û�֧�� 1500 Ԫ����ӡ����СƱ����˴ι����õĻ�Ա����(ÿ���� 100 Ԫ��� 3 ��)*/
import java.util.Scanner;
public class Pay{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("*******���ѵ�*******");
		System.out.println("������Ʒ\t����\t����\t���");
		System.out.println("T��\t\t��245\t2\t��490");
		System.out.println("����Ь\t\t��570\t1\t��570");
		System.out.println("������\t\t��320\t1\t��320\n");
		double cost=input.nextInt();
		double getback=cost-1104.0;
		int jifen=(int)1104.0/100*3;
		System.out.println("�ۿۣ�\t8��");
		System.out.println("�����ܽ��\t��1104.0");
		System.out.println("ʵ�ʽ���\t��"+cost);
		System.out.println("��Ǯ\t��"+getback);
		System.out.println("���ι������������:"+jifen);
	}
}