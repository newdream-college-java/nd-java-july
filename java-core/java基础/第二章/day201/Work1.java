/*��������С�������� a,b �У����ʵ�� a �� b �����е�ֵ������
������ a �� b �е�ֵ��*/
import java.util.Scanner;
public class Work1{
	public static void main(String[] args){
		Scanner x = new Scanner(System.in);
		double a = x.nextDouble();
		double b = x.nextDouble();
		double temp;
		temp = a;
		a= b;
		b = temp;
		System.out.println(a+"\t"+b);
	}
}