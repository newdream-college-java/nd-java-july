/*�������� int �͵����ݣ����뵽 a,b,c ����������ȥ��ʹ�������ṹ�뽻���߼��������������е�ֵ��С�������С�*/
import java.util.Scanner;
public class Work5{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�������һ������a��");
		int a = input.nextInt();
		System.out.println("������ڶ�������b��");
		int b = input.nextInt();
		System.out.println("���������������c��");
		int c = input.nextInt();
		if(a>b){
			a = a+b;
			b = a-b;
			a = a-b;
		}
		if(a>c){
			a = a+c;
			c = a-c;
			a = a-c;
		}
		if(b>c){
			b = b+c;
			c = b-c;
			b = b-c;					
		}	
		System.out.println("a="+a+"\tb="+b+"\tc="+c);
		
	}
}