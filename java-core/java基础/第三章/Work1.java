/*1������һ����λ�����������ǲ��ǽ�������:531 �ǽ����� ��λ>ʮλ>��λ*/
import java.util.Scanner;
public class Work1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("��������λ����������\t");
		int x = input.nextInt();
		int a = x%10;
		int b = x/10%10;
		int c = x/100%10;
		if(a<b&&b<c){
			System.out.println("�ǽ�����");
		}else System.out.println("���ǽ�����");
	}
}