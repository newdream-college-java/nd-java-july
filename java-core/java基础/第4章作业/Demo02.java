/*����ȥ���ң������ 3 �����£��ϰ�Ͳ����ң������ 3 ���� 5 ��������һ��
�ң������ 5 �����Ͼ��� 2 ���ң�����Ҫ��������ӵ���������������������
�˼����ҡ�*/
import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������Ҫ�����������");
		int a=input.nextInt();
		if(a<3){
			System.out.print("�򵽵�������Ϊ��"+a);
		}else if(a>=3&&a<5){
			System.out.print("�򵽵�������Ϊ��"+(a+1));
		}else{
			System.out.print("�򵽵�������Ϊ��"+(a+2));
		}
	}
}