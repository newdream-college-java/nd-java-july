/*3������һ����λ����������Ҫ���̽������λ���еĸ�λ��ʮλ����λ��ǧλ�ֱ������ */
import java.util.Scanner;
public class C{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ����λ������");
		int a = input.nextInt();
		int g = a%10;
		int s = a/10%10;
		int b = a/100%10;
		int q = a/1000%10; 
		System.out.println("��λ��"+g+"\tʮλ��"+s+"��λ��"+b+"ǧλ��"+q);
}
}
		
		