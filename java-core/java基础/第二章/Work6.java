/*6������һ�� 3 λ�����ֱ���뵽 3 ��������ȥ����̽��� 3 �������е�ֵ�������������
������ 123 ���������뵽 a,b,c ��ȥ�������� a,b,c ��ֵ��Ҫ����� 321��*/
import java.util.Scanner;
public class Work6{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�������һ������a��");
		int a = input.nextInt();
		System.out.println("������ڶ�������b��");
		int b = input.nextInt();
		System.out.println("���������������c��");
		int c = input.nextInt();
		if(a<b){
			a = a+b;
			b = a-b;
			a = a-b;
		}
		if(a<c){
			a = a+c;
			c = a-c;
			a = a-c;
		}
		if(b<c){
			b = b+c;
			c = b-c;
			b = b-c;					
		}	
		System.out.println("a="+a+"\tb="+b+"\tc="+c);		
	}
}