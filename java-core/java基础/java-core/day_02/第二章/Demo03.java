/*3������һ����λ����������Ҫ���̽������λ���еĸ�λ��ʮλ����λ��ǧλ�ֱ������*/
import java.util.*;
public class Demo03{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		System.out.print("������һ����λ����");
		int a=input.nextInt();
		int b,c,d,e;
		b=a%10;
		c=a/10%10;
		d=a/100%10;
		e=a/1000;
		System.out.println("��λ="+b+"     ʮλ="+c+"     ��λ="+d+"   ǧλ="+e);

	}
}