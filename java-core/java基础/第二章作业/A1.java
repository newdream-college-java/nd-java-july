/*��������С�������� a,b �У����ʵ�� a �� b �����е�ֵ������
������ a �� b �е�ֵ��*/
import java.util.Scanner;
public class A1{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������С��a");
		double a = input.nextDouble();
		System.out.println("������С��b");
		double b = input.nextDouble();
		double c;
		c=a;a=b;b=c;
		System.out.println("������С��aΪ"+a+"С��bΪ"+b);
	}
}
		