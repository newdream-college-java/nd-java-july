/*
����ϰ 2 �� ѵ��Ҫ�� ʹ�ó�������ʵ�����е�����
2.1������ȥ���ң������ 3 �����£��ϰ�Ͳ����ң������ 3 ���� 5 ��������һ��
�ң������ 5 �����Ͼ��� 2 ���ң�����Ҫ��������ӵ���������������������
�˼�����
*/
import java.util.*;
public class Demo02{
	public static void main (String [] args){
		System.out.println("�����������������");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if(number>5){
			number=number+2;
		}
		else if(number>2){
			number= number+1;
		}
		System.out.print("�ܵ���������"+number);
	}
}