/*1.ʹ�� switch ѡ��ṹʵ�ִӵ�¼�˵��л������˵����ܣ� �������� 1���������˵� �������� 2���˳�����ʾ��лл����ʹ�á�,�����������֣���ʾ���������*/
import java.util.Scanner;
public class Manager{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("\t**********�������ϵͳ**********");
		System.out.println("\t\t1.��¼ϵͳ");
		System.out.println("\t\t2.�˳�");
		System.out.print("����������룺");
		int numLogin=input.nextInt();
		switch(numLogin){
			case 1:
				System.out.println("\t**********���˵�**********");
				System.out.println("\t\t1.�ͻ���Ϣ����");
				System.out.println("\t\t2.�������");
				System.out.println("\t\t3.�������");
				System.out.println("\t\t4.ע��");
				System.out.print("����������룺");
				int numMenu=input.nextInt();
				switch(numMenu){
					case 1:
						System.out.println("\t*****�������ϵͳ>�ͻ���Ϣ����*****");
						System.out.println("\t\t1.��ʾ���пͻ���Ϣ");
						System.out.println("\t\t2.��ӿͻ���Ϣ");
						System.out.println("\t\t3.�޸Ŀͻ���Ϣ");
						System.out.println("\t\t4.��ѯ�ͻ���Ϣ");
					break;
					case 2:
						System.out.println("������δ��ͨ");
					break;
					case 3:
						System.out.println("\t*****�������ϵͳ>�������*****");
						System.out.println("\t\t1.���˴����");
						System.out.println("\t\t2.���˳齱");
						System.out.println("\t\t3.�����ʺ�");
					break;
					case 4:
						System.out.println("������δ��ͨ");
					break;
					default:
						System.out.println("������󣡣���");
				}
			break;
			case 2:
				System.out.println("лл����ʹ�ã�");
				break;
			default:
				System.out.println("������󣡣���");
		}
	}
}