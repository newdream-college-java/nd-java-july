/*��������������������������������*/
import java.util.Scanner;
public class A4 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("�������һ������");
		int a = input.nextInt();
		System.out.print("������ڶ�������");
		int b = input.nextInt();
		System.out.print("���������������");
		int c = input.nextInt();
		if(a == b){
			if(a == c){
				System.out.print("�����������");	
			}else if(a+b+c > 1000){
				System.out.print("��������֮�ʹ���1000");
			}else {
				System.out.print("��������֮�Ͳ�������1000");
			}
		}else if(a+b+c > 1000){
			System.out.print("��������֮�ʹ���1000");
		}else {
			System.out.print("��������֮�Ͳ�����1000");
		} 
	}
}