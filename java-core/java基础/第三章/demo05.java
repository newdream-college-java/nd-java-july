/*5���������� int �͵����ݣ����뵽 a,b,c ����������ȥ��
ʹ�������ṹ�뽻���߼��������������е�ֵ��С�������С�*/
import java.util.Scanner;
public class demo05{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		System.out.println("����������������");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int tmp;
		if(a>b){
			tmp=a;
			a=b;
			b=tmp;
		}
		if(a>c){
			tmp=a;
			a=c;
			c=tmp;
		}
		if(b>c){
			tmp=b;
			b=c;
			c=tmp;
		}
		System.out.println(a+"<"+b+"<"+c);
	}
}