/*���ʵ�������������֧��+��-��*��/���ӿ���̨���� 2 ���������������
������*/
import java.util.Scanner;
public class Demo07{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("����������Ҫ���е���λ�����㣺");
		System.out.print("�������һ������");
		double a=input.nextDouble();
		System.out.print("��������ţ�");
		char b=input.next().charAt(0);
		System.out.print("������ڶ�������");
		double c=input.nextDouble();
		double sum=0;
		switch(b){
			case '+':
			sum=a+c;
			break;
			case '-':
			sum=a-c;
			break;
			case 'x':
			sum=a*c;
			break;
			case '/':
			sum=a/c;
			break;
			default:
			System.out.println("Ŀǰֻ֧�ּӼ��˳�Ŷ��");
			
		}
		System.out.println("����Ľ��Ϊ��"+sum);
	}
}