/*дһ�� Pay ��ģ�ʵ���������󣬽���ʱ�û�֧�� 1500 Ԫ����ӡ����СƱ
����˴ι����õĻ�Ա����(ÿ���� 100 Ԫ��� 3 ��)*/
import java.util.Scanner;
public class Work7{
	public static void main(String[] args){
		System.out.println("������Ʒ\t����\t����\t���");
		System.out.println("T��\t\t��245\t2\t��490");
		System.out.println("����Ь\t\t��570\t1\t��570");
		System.out.println("������\t\t��320\t1\t��320");
		System.out.println();
		Scanner input = new Scanner(System.in);
		System.out.print("������ĸ����");
		int a = input.nextInt();
		System.out.println("�ۿۣ�\t8��");
		System.out.println("�����ܽ��\t��1104.0");
		System.out.println("ʵ�ʽ���\t��"+a);
		System.out.println("��Ǯ\t��"+(a-1104.0));
		System.out.print("���ι�������Ļ����ǣ�"+1104/100*3);
	}
}