/*
5���������� int �͵����ݣ����뵽 a,b,c ����������ȥ��ʹ�������ṹ�뽻���߼���
�����������е�ֵ��С��������
*/
import java.util.Scanner;
public class Demo05{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������a��");
		int a = input.nextInt();
		System.out.print("������b��");
		int b = input.nextInt();
		System.out.print("������c��");
		int c = input.nextInt();
		int d;
		if(a>b){
			d=a;
			a=b;
			b=d;
		}
		if(a>c){
			d=a;
			a=c;
			c=d;
		}
		if(b>c){
			d=b;
			b=c;
			c=d;
		}
		System.out.println("��������Ϊ��"+a+b+c);
	}
}