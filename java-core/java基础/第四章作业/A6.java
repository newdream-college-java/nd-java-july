/*���ʵ�����������*/
import java.util.Scanner;
public class A6{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("�������һ����");
		double a = input.nextDouble();
		System.out.print("������ڶ�����");
		double b = input.nextDouble();
		System.out.print("����1���мӷ�������2���м���������3���г˷�������4���г���");
		int c = input.nextInt();
		switch(c){
			case 1:
			System.out.print(a+b);
			break;
			case 2:
			System.out.print(a-b);
			break;
			case 3:
			System.out.print(a*b);
			break;
			case 4:
			System.out.print(a/b);
			break;
			default:
			System.out.print("�������");
		}
	}
}
			