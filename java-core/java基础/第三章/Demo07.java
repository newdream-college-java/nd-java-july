/*
7�������� GoodLuck ʵ�����˳齱���齱���򣺻�Ա�ŵİ�λ���ֵ��ڲ�����������ּ�Ϊ
���˻�Ա
*/
import java.util.Scanner;
public class Demo07{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�������ع������ϵͳ>���˴�齱");
		System.out.println("___________________________________");
		System.out.print("������4λ��Ա�ţ�");
		int n = input.nextInt();
		int a,b;
		b=n;
		a=b%10;
		b=(b-a)/10;
		a=b%10;
		b=(b-a)/10;
		a=b%10;
		int luck = 2;
		if(a == luck){
			System.out.println(n+"�ſͻ������˿ͻ����������һ�ף�����");
		}
		else{
			System.out.println(n+"�ſͻ���лл����֧�֣�����");
		}
	}
}