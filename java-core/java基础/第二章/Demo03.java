/*3������һ����λ����������Ҫ���̽������λ���еĸ�λ��ʮλ����λ��ǧλ�ֱ������*/
import java.util.Scanner;
public class Demo03{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������һ����λ����������");
		int a = input.nextInt();
		int b,c,d,e;

		b=a%10;
		a=(a-b)/10;

		c=a%10;
		a=(a-c)/10;

		d=a%10;
		a=(a-d)/10;

		e=a%10;
		System.out.println("��λ��Ϊ��"+b);
		System.out.println("ʮλ��Ϊ��"+c);
		System.out.println("��λ��Ϊ��"+d);
		System.out.println("ǧλ��Ϊ��"+e);
	}
}