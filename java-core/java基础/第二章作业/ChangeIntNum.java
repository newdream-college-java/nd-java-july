/*4�������������������뵽�������� a �� b �У���̽� a �� b �е�ֵ�����������*/
import java.util.Scanner;
public class ChangeIntNum{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������a��ֵ��");
		int a=input.nextInt();
		System.out.print("������b��ֵ��");
		int b=input.nextInt();
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("������:a="+a+",b="+b);
	}
}