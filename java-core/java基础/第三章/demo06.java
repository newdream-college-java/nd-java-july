/*6������һ�� int �͵����ݣ��ж�������� ���ܱ� 2 ����������ܱ� 2 ������
 ��ô������������ż������������������������������*/
import java.util.Scanner;
public class demo06{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ��������");
		int a = input.nextInt();
		if(a%2==0){
			System.out.println("�������ż��");
		}else{
			System.out.println("�����������");
		}
	}
}