/*��������С��������a,b�У����ʵ��a��b����ֵ�Ľ���*/
import java.util.Scanner;
public class Demo01{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("����������a��");
		double a = input.nextDouble();
		System.out.print("����������b��");
		double b = input.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("����ǰa:"+b+"\t"+"b:"+"\t"+a);
		System.out.println("������a:"+a+"\t"+"b:"+"\t"+b);
	}
}