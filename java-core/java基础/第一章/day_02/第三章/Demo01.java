/*1������һ����λ�����������ǲ��ǽ�������:531 �ǽ����� ��λ>ʮλ>��λ*/
import java.util.*;
public class Demo01{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("������һ����λ������");
		int n=in.nextInt();
		int a,b,c;
		a=n%10;
		b=n/10%10;
		c=n/100;
		if(c>b&&b>a){
		System.out.println("������˳��������");
		}else System.out.println("��������˳��������");
			
	}
}