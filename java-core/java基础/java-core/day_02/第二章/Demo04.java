/*4�������������������뵽�������� a �� b �У���̽� a �� b �е�ֵ�����������*/
import java.util.*;
public class Demo04{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("�������һ��������");
		int a=in.nextInt();
		int b=in.nextInt();
		int temp;
		System.out.println("a="+a+"\t"+"b="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a+"\t"+"b="+b);	
	}
}