/*ʹ�� switch ѡ��ṹʵ�ִӵ�¼�˵��л������˵����ܣ� �������� 1���������˵� �������� 2���˳�����ʾ��лл����ʹ�á�*/
import java.util.Scanner;
public class Work1{
	public static void main(String[] args){
		Work1 t = new Work1();
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ع������ϵͳ");
		System.out.println();
		System.out.println("\t1����¼");
		System.out.println("\t2���˳�");
		System.out.println("������ѡ�");
		int a = sc.nextInt();
		switch(a){
			case 1:
				t.menu();
				break;
			case 2:
				System.out.println("лл���ʹ�ã�");
				break;
			default:
				System.out.println("�����ڸ�ѡ��");
		}	
	}
	public  void menu(){
		System.out.println("\t���˵�");	
		System.out.println();
		System.out.println("\t1���ͻ���Ϣ����");
		System.out.println("\t2���������");
		System.out.println("\t3���������");
		System.out.println("\t4��ע��");
		Scanner sc1 = new Scanner(System.in);
		int b = sc1.nextInt();
		switch(b){
			case 1:
				inform();
				break;
			case 2:
				buy();
				break;	
			case 3:
				play();
				break;
			default:
				System.out.println("�����ڸ�ѡ��");
		}
	}

	public void inform(){
		System.out.println("\t�ͻ���Ϣ����ϵͳ");	
		System.out.println();
		System.out.println("\t1����ʾ���пͻ���Ϣ");
		System.out.println("\t2����ӿͻ���Ϣ");
		System.out.println("\t3���޸Ŀͻ���Ϣ");
		System.out.println("\t4����ѯ�ͻ���Ϣ");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("������ѡ�");
		int b = sc1.nextInt();
		switch(b){
			case 1:
				System.out.println("���пͻ���Ϣ");
				break;
			case 2:
				System.out.println("���");
				break;
			case 3:
				play();
				break;
			default:
				System.out.println("�����ڸ�ѡ��");
		}
	}

	public void buy(){
		System.out.println("\t���������ѽ�");	
		System.out.println();
		System.out.println("�Ƿ�μ��Żݻ������");
	}

	public void play(){
		System.out.println("\t�������ϵͳ");	
		System.out.println();
		System.out.println("\t1�����˴����");
		System.out.println("\t2�����˳齱");
		System.out.println("\t3�������ʺ�");
	}
}