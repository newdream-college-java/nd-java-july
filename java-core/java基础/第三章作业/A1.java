/*����һ����λ�����������ǲ��ǽ�����*/
import java.util.Scanner;
public class A1{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������һ����λ����: ");
		int a = input.nextInt();
		if(a/100 > a/10%10){
			if(a/100 > a%10){
				System.out.print("������ǽ�����");
			}else {
				System.out.print("��������ǽ�����");
			}
		}else {
			System.out.print("��������ǽ�����");
		}
	}
}