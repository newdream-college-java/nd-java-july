/*
3������һ����λ����������Ҫ���̽������λ���еĸ�λ��ʮλ����λ��ǧλ�ֱ����.
*/
import java.util.Scanner;
public class Demo03{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������һ����λ����������");
		int a = input.nextInt();
		int b = a%10;
		int c = a/10%10;
		int d = a/100%10;
		int e = a/1000;
		System.out.print("�����ĸ�λΪ��"+b+"ʮλΪ��"+c+"��λΪ��"+d+"ǧλΪ��"+e);
	}
}