/*дһ��pay�࣬ʵ���������󣬽���ʱ�û�֧��1500Ԫ����ӡ����СƱ����˴ι����õĻ�Ա����*/
import java.util.Scanner;
public class Demo07{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("�ۿۣ�\t8��");
		System.out.print("�����ܽ�\t");
		double a=input.nextDouble();
		System.out.print("ʵ�ʽ��ѣ�\t");
		double b=input.nextDouble();
		System.out.println("��Ǯ��\t"+(b-a));
		System.out.println("���ι�������Ļ����ǣ�\t"+(int)(a/100*3));
	}
}