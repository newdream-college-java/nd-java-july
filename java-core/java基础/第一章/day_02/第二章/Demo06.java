/*6������һ�� 3 λ�����ֱ���뵽 3 ��������ȥ����̽��� 3 �������е�ֵ���������� 123 ���������뵽 a,b,c ��ȥ�������� a,b,c ��ֵ��Ҫ����� 321��*/
import java.util.*;
public class Demo06{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("������һ����λ����");
		int n=in.nextInt();
		int a,b,c;
		a=n%10;
		b=n/10%10;
		c=n/100;
		System.out.println(a+""+b+""+c);	
	}
}