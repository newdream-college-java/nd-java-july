/*����һ��С����Ȼ��������������ֺ�С������*/
import java.util.Scanner;
public class Demo08{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������һ��С����");
		double a=input.nextDouble();
		int b=(int)a;
		double c=a-b;
		System.out.println("С��\t��������\tС������");
		System.out.println(a+"\t"+b+"\t\t"+c);
	}
}