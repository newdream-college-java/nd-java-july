/*3������һ����λ����������Ҫ���̽������λ����
�ĸ�λ��ʮλ����λ��ǧλ�ֱ������*/
import java.util.Scanner;
public class demo03{
	public static void main(String []args){
		Scanner input =new Scanner(System.in);
		int a=input.nextInt();
		System.out.println("��λ��"+a%10);
		System.out.println("ʮλ��"+(a/10)%10);
		System.out.println("��λ��"+(a/100)%10);
		System.out.println("ǧλ��"+(a/1000)%10);	
	}
}