/*�������ع������ϵͳ*/
import java.util.Scanner;
public class Demo01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("*********��¼�˵�(��һ��)*********");
		System.out.println("\t1.��¼ϵͳ");
		System.out.println("\t2.�˳�");
		System.out.print("������ѡ��1��");
		int a=input.nextInt();
		switch(a){
			case 1:
			System.out.println("*********���˵�(�ڶ���)*********");
			System.out.println("\t1.�ͻ���Ϣ����");
			System.out.println("\t2.�������");
			System.out.println("\t3.�������");
			System.out.println("\t4.ע��");
			System.out.print("������ѡ��2��");
			int b=input.nextInt();
			switch(b){
				case 1:
				System.out.println("*********�������ϵͳ*********");
				System.out.println("\t1.��ʾ���пͻ���Ϣ");
				System.out.println("\t2.��ӿͻ���Ϣ");
				System.out.println("\t3.�޸Ŀͻ���Ϣ");
				System.out.println("\t4.��ѯ�ͻ���Ϣ");
				break;
				case 2:
				break;
				case 3:
				System.out.println("*********�������ϵͳ*********");
				System.out.println("\t1.���˴����");
				System.out.println("\t2.���˳齱");
				System.out.println("\t3.�����ʺ�");
				break;
				case 4:
				default:
				System.out.println("�������");
				break;
			}
			break;
			case 2:
			break;
			default:
			System.out.println("�������");
		}
	}
}