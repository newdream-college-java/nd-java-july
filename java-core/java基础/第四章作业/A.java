/*	switch ѡ��ṹ
	����˵��
	���˵������ṹ��ͼ��
	ʹ�� switch ѡ��ṹʵ�ִӵ�¼�˵��л������˵����ܣ�
	�������� 1���������˵�
	�������� 2���˳�����ʾ��лл����ʹ�á�
	�����������֣���ʾ��������� 
*/

import java.util.Scanner;
public class A{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ع������ϵͳ");
		System.out.println();
		System.out.println("\t1����¼");
		System.out.println("\t2���˳�");
		System.out.println("������ѡ�");
		int a = sc.nextInt();
		switch(a){
			case 1:
				System.out.println("\t���˵�\n\n");	
				System.out.println("\t1���ͻ���Ϣ����");
				System.out.println("\t2���������");
				System.out.println("\t3���������");
				System.out.println("\t4��ע��");
				int b = sc.nextInt();
				switch(b){
					case 1:
					System.out.println("\t�ͻ���Ϣ����ϵͳ\n\n");	
					System.out.println("\t1����ʾ���пͻ���Ϣ");
					System.out.println("\t2����ӿͻ���Ϣ");
					System.out.println("\t3���޸Ŀͻ���Ϣ");
					System.out.println("\t4����ѯ�ͻ���Ϣ");
					System.out.println("������ѡ�");
					int c = sc.nextInt();
					switch(c){
						case 1:
							System.out.println("���пͻ���Ϣ");
						case 2:
							System.out.println("���");
						case 3:
							System.out.println("�����ڸ�ѡ��");
							break;
						default:
							System.out.println("�����ڸ�ѡ��");
						}
					break;
					case 2:
						System.out.println("\t���������ѽ�\n");	
						System.out.println("�Ƿ�μ��Żݻ������");
						break;	
					case 3:
						System.out.println("\t�������ϵͳ\n");	
						System.out.println("\t1�����˴����");
						System.out.println("\t2�����˳齱");
						System.out.println("\t3�������ʺ�");
						break;
					default:
						System.out.println("�����ڸ�ѡ��");
					}
				break;
			case 2:
				System.out.println("лл���ʹ�ã�");
				break;
			default:
				System.out.println("�����ڸ�ѡ��");
			}	

	}
}
	

	
