/*
1������һ����λ�����������ǲ��ǽ�������:531 �ǽ�����  ��λ>ʮλ>��λ
*/
import java.util.*;
public class Demo01{
	public static void main(String [] args){
		System.out.print("������һ����λ������");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		if(x/100>x/10%10&&x/10%10>x%10)
		System.out.print("���ǽ�����");
		else
		System.out.print("�䲻�ǽ�����");
	}
}