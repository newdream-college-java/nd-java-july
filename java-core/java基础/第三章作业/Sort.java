/*5���������� int �͵����ݣ����뵽 a,b,c ����������ȥ��ʹ�������ṹ�뽻���߼��������������е�ֵ��С�������С�*/
import java.util.Scanner;
public class Sort{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("�������һ������");
		int a=input.nextInt();
		System.out.print("������ڶ�������");
		int b=input.nextInt();
		System.out.print("���������������");
		int c=input.nextInt();
		if(a>b){
			a=a+b;
			b=a-b;
			a=a-b;
		}
		if(b>c){
			b=b+c;
			c=b-c;
			b=b-c;
		}
		if(a>b) {
			a=a+b;
			b=a-b;
			a=a-b;
		}
		System.out.println("���Ϊ��"+a+"��"+b+"��"+c);
	}
}