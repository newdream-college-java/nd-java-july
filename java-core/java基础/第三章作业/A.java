/*1������һ����λ�����������ǲ��ǽ�������:531 �ǽ����� ��λ>ʮλ>��λ*/
import java.util.Scanner;
public class A{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("��������λ����:");
		int num=input.nextInt();
		int a=num%10;
		int b=num/10%10;
		int c=num%100;
		if(c>b&&b>a){			
			System.out.println(num+"�ǽ�����");
		}else{
			System.out.println(num+"���ǽ�����");
		}
	}
}