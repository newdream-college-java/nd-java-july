/*
2.1������ȥ���ң������ 3 �����£��ϰ�Ͳ����ң������ 3 ���� 5 ��������һ��
�ң������ 5 �����Ͼ��� 2 ���ң�����Ҫ��������ӵ���������������������
�˼����ҡ�
*/
import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������Ҫ�򼸸��ң�");
		int n = input.nextInt();
		if(n<3){
			System.out.println("����������"+n+"������");
		}
		else if(n>=3&&n<=5){
			n = n+1;
			System.out.println("����������"+n+"������");
		}
		else{
			n = n+2;
			System.out.println("����������"+n+"������");
		}
	}
}