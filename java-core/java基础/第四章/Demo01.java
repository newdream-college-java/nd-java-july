/*����ϰ 1�� ѵ��Ҫ�� switch ѡ��ṹ
����˵��
���˵������ṹ��ͼ��
ʹ�� switch ѡ��ṹʵ�ִӵ�¼�˵��л������˵����ܣ�
�������� 1���������˵�
�������� 2���˳�����ʾ��лл����ʹ�á�
�����������֣���ʾ���������
*/
import java.util.*;
public class Demo01{
	public static void main (String [] args){
		System.out.println("��ӭ���������빺�����ϵͳ");
		System.out.println("1����¼ϵͳ");
		System.out.println("2���˳�");
		System.out.println("��ѡ��");
		Scanner input =new Scanner(System.in);
		int login = input.nextInt();
		if(login==1){
			System.out.println("�˵�");
			System.out.println("1���ͻ���Ϣ����");
			System.out.println("2���������");
			System.out.println("3���������");
			System.out.println("4��ע��");
			System.out.println("��ѡ��");
			int list = input.nextInt();
			switch(list){
				case 1:
					System.out.println("�ͻ���Ϣ����ϵͳ");
					System.out.println("1����ʾ���пͻ�");
					System.out.println("2����ӿͻ���Ϣ");
					System.out.println("3���޸Ŀͻ���Ϣ");
					System.out.println("4����ѯ�ͻ���Ϣ");
					break;
				case 2:
					System.out.println("�������");
					System.out.println("1�����˴����");
					System.out.println("2�����˳齱");
					System.out.println("3�������ʺ�");
					break;
				case 3:
					System.out.println("�������ϵͳ�������С�������");
					break;
				case 4:
					break;
				default:	
					System.out.print("�������");
					break;
			}
		}
		else if(login==2){
			System.out.println("��ӭ�´ι���");
			return;	
		}
		else
		System.out.print("�������");
	}
}