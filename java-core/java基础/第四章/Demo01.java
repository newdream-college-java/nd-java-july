/*
switch ѡ��ṹ
����˵��
���˵������ṹ��ͼ��
ʹ�� switch ѡ��ṹʵ�ִӵ�¼�˵��л������˵����ܣ�
�������� 1���������˵�
�������� 2���˳�����ʾ��лл����ʹ�á�
*/
import java.util.Scanner;
public class Demo01{
	public static void main(String[] args){
		//������
		Scanner input = new Scanner(System.in);
		System.out.println("**************��ӭʹ���������ع������ϵͳ***********");
		System.out.println("                              1����¼ϵͳ");
		System.out.println("                              2���˳�");
		//���ܽ���
		System.out.print("��ѡ���������֣�");
		int a = input.nextInt();
		if(a == 1){
			System.out.println("**************��ӭʹ���������ع������ϵͳ***********");
			System.out.println("                         1���ͻ���Ϣ����");
			System.out.println("                         2���������");
			System.out.println("                         3���������");
			System.out.println("                         4��ע��");
			System.out.print("��ѡ���������֣�");
			int b = input.nextInt();
			switch(b){
				case 1:
					System.out.println("�������ϵͳ>�ͻ���Ϣ����");
					System.out.println("1����ʾ���пͻ���Ϣ");
					System.out.println("2����ӿͻ���Ϣ");
					System.out.println("3���޸Ŀͻ���Ϣ");
					System.out.println("4����ѯ�ͻ���Ϣ");
					break;
				case 2:
					System.out.println("�ù��ܻ�δ��ͨ�������ڴ�������");
					break;
				case 3:
					System.out.println("�������ϵͳ>�ͻ���Ϣ����");
					System.out.println("1�����˴�齱");
					System.out.println("2�����˳齱");
					System.out.println("3�������ʺ�");
					break;
				case 4:
					System.out.println("��л����ʹ�ã�����");
				default :
					System.out.println("������󣡣���");
			}

		}
		else if(a == 2){
			System.out.println("**************************************");
			System.out.println("лл����ʹ�ã�����");
		}
		else{
			System.out.println("*************************************");
			System.out.println("                     ������󣡣���");
		}
	}
}