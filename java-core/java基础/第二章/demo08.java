/*8��(��ս��)����һ��С����Ȼ��������������ݺ�С������,��ʽ����
С�� �������� С������*/
import java.util.Scanner;
public class demo08{
	public static void main(String []args){
		Scanner input =new Scanner(System.in);
		System.out.println("����һ��С����");
		double a=input.nextDouble();
		int b=(int)a;
		double c=a-b;
		System.out.println("�������֣�"+b);
		System.out.println("С�����֣�"+c);
	}
}