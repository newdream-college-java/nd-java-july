/*
6������һ�� int �͵����ݣ��ж�������� ���ܱ� 2 ����������ܱ� 2 ������
 ��ô������������ż������������������������������
 ��ʾ:8%2==0 10%2==0
 9%2=1
*/
import java.util.Scanner;
public class Demo06{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("����һ�����֣�");
		int a = input.nextInt();
		if(a%2 == 0){
			System.out.println("����һ��ż��������");
		}
		else{
			System.out.println("����һ������������");
		}
	}
}