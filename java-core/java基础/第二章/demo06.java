/*6������һ�� 3 λ�����ֱ���뵽 3 ��������ȥ
����̽��� 3 �������е�ֵ�������������������
 123 ���������뵽 a,b,c ��ȥ��������a,b,c ��ֵ
��Ҫ����� 321��*/
import java.util.Scanner;
public class demo06{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("��������λ����");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int tmp;
		if(a<b){
			tmp=a;
			a=b;
			b=tmp;
		}
		if(a<c){
			tmp=a;
			a=c;
			c=tmp;
		}
		if(b<c){
			tmp=b;
			b=c;
			c=tmp;
		}
		System.out.println("��λ���ֱ�Ϊ��a="+a+"b="+b+"c="+c);
	}
}