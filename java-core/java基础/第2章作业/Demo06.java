/*����һ��3λ�����ֱ���뵽3��������ȥ����̽���3�������е�ֵ���������*/
import java.util.Scanner;
public class Demo06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������һ��3λ����");
		int i=input.nextInt();
		int a=i/100;
		int b=i/10%10;
		int c=i%10;
		System.out.println("�任ǰ��ֵ��"+a+"\t"+b+"\t"+c);
		int temp;
		temp=a;
		a=c;
		c=temp;
		System.out.println("�任���ֵ��"+a+"\t"+b+"\t"+c);
	}
}