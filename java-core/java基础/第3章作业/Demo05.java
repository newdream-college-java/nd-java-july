/*�������� int �͵����ݣ����뵽 a,b,c ����������ȥ��
ʹ�������ṹ�뽻���߼��������������е�ֵ��С�������С�*/
import java.util.Scanner;
public class Demo05{
	public static void  main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������3��������");
		System.out.print("a=");
		int a=input.nextInt();
		System.out.print("b=");
		int b=input.nextInt();
		System.out.print("c=");
		int c=input.nextInt();
		int temp;
		if(a>b){
			temp=a;
			a=b;
			b=temp;
		}
		if(a>c){
			temp=a;
			a=c;
			c=temp;
		}
		if(b>c){
			temp=b;
			b=c;
			c=temp;
		}
		System.out.println(a+"\t"+b+"\t"+c);
	}
}