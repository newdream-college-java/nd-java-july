/*4�������������������뵽�������� a �� b �У���̽� a �� b �е�ֵ���������*/
import java.util.Scanner;
public class Demo04{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("����������a��");
		int a = input.nextInt();
		System.out.print("����������b��");
		int b = input.nextInt();
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("����ǰa��"+b+"b:"+"\t"+a);
		System.out.println("������a��"+a+"b:"+"\t"+b);
	}
}