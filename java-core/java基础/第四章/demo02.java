/*2.1������ȥ���ң������ 3 �����£��ϰ�Ͳ����ң������ 3 ���� 5 ��������һ��
�ң������ 5 �����Ͼ��� 2 ���ң�����Ҫ��������ӵ���������������������
�˼����ҡ�*/
import java.util.Scanner;
public class demo02{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		System.out.println("��������ӵ����Ҹ���");
		int a=input.nextInt();
		if(a<3){
			System.out.println("����򵽵����Ӹ���Ϊ��"+a);
		}else if(a<=5){
			System.out.println("����򵽵����Ӹ���Ϊ��"+(a+1));
		}else{
			System.out.println("����򵽵����Ӹ���Ϊ��"+(a+2));
		}
	}
}