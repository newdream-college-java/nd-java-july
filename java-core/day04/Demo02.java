import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//2.1������ȥ���ң������ 3 �����£��ϰ�Ͳ����ң������ 3 ���� 5 ��������һ���ң������ 5 �����Ͼ��� 2 ���ң�����Ҫ��������ӵ����������������������˼����ҡ�
		System.out.println("������������");
		int data=input.nextInt();
		if(data>=3&&data<=5){
			++data;
		}else if(data>5){
			data=data+2;
		}
		System.out.println("�������"+data);
		System.out.println("*********************�ָ���*********************");
		//2.2�����̲μӼ������̴���
		//	�����õ� 1 �������μ���ʡ����ѧ��֯�� 1 ��������Ӫ
		//	�����õ� 2 �������������ձʼǱ�����һ��
		//	�����õ� 3 �����������ƶ�Ӳ��һ��
		//	���򣬲����κν���
		System.out.println("����������");
		data=input.nextInt();
		switch(data){
			case 1:
			System.out.println("�� 1 �������μ���ʡ����ѧ��֯�� 1 ��������Ӫ");
			break;
			case 2:
			System.out.println("�� 2 �������������ձʼǱ�����һ��");
			break;
			case 3:
			System.out.println("�� 3 �����������ƶ�Ӳ��һ��");
			break;
			default:
			System.out.println("û�н���");
			break;
		}
	}
}