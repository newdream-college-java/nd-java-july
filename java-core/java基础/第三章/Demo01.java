/*
1������һ����λ�����������ǲ��ǽ�������:531 �ǽ����� ��λ>ʮλ>��λ
*/
import java.util.Scanner;
public class Demo01{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������һ����λ������");
		int n = input.nextInt();
		int a,b,c;
		a=n%10;
		n=(n-a)/10;
		b=n%10;
		n=(n-b)/10;
		c=n%10;
		
		if(a<b){
			if(b<c)
				System.out.println("������ǽ�������");
		}
		else
			System.out.println("��������ǽ�������");
	}
}