/*
(��ս��)����һ��С����Ȼ��������������ݺ�С������,��ʽ����
С�� �������� С������
3.14 3 0.14
*/
import java.util.Scanner;
public class Demo08{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��С����");
		double n = input.nextDouble();
		int a;
		double b;
		a=(int)n;
		b=n-a;
		System.out.println("С��"+"\t"+"��������"+"\t"+"С������");
		System.out.println(n+"\t"+a+"\t"+b);
	}
}