/*2.1������ȥ���ң������ 3 �����£��ϰ�Ͳ����ң������ 3 ���� 5 ��������һ�� �ң������ 5 �����Ͼ��� 2 ���ң�����Ҫ��������ӵ��������������������� �˼����ҡ�*/
import java.util.Scanner;
public class Work2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("��������������");
		int x = sc.nextInt();
		if(x<=3){
			System.out.println("�����������Ϊ��"+x);
		}else if(x<=5){
			System.out.println("�����������Ϊ��"+(x+1));
		}else
			System.out.println("���򵽵�������Ϊ��"+(x+2));
	}
}