/*6������һ�� 3 λ�����ֱ���뵽 3 ��������ȥ����̽��� 3 �������е�ֵ�������������
������ 123 ���������뵽 a,b,c ��ȥ�������� a,b,c ��ֵ��Ҫ����� 321��*/
import java.util.Scanner;
public class ChangeDemo2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������a:");
		int a=input.nextInt();
		System.out.print("������b:");
		int b=input.nextInt();
		System.out.print("������c:");
		int c=input.nextInt();
		a=a+c;
		c=a-c;
		a=a-c;
		System.out.print("a="+a+",b="+b+",c="+c);
	}
}