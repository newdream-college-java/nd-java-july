import java.util.Scanner;


public class CurretTimeDemo {
	public static void main(String[] args) {
		CurrentTime data=new CurrentTime();
		data.show();
		Scanner input=new Scanner(System.in);
		System.out.println("��������ĵ����");
		data.year=input.nextInt();
		System.out.println("��������ĵ��·�");
		data.month=input.nextInt();
		System.out.println("��������ĵ���");
		data.day=input.nextInt();
		System.out.println("��������ĵ�ʱ");
		data.point=input.nextInt();
		System.out.println("��������ĵķ�");
		data.points=input.nextInt();
		System.out.println("��������ĵ���");
		data.seconds=input.nextInt();
		data.show();
	}
}
