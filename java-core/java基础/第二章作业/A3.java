/*����һ����λ����������Ҫ���̽������λ���еĸ�λ��
ʮλ����λ��ǧλ�ֱ������*/
import java.util.Scanner;
public class A3{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("����һ����λ��������");
		int a = input.nextInt();
		System.out.println("�����ĸ�λΪ"+a%10);
		System.out.println("������ʮλΪ"+a/10%10);
		System.out.println("�����İ�λΪ"+a/100%10);
		System.out.println("������ǧλΪ"+a/1000);
	}
}