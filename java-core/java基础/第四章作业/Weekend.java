/*2.3������һ�����֣������������� 1����ô�������һ�������������� 2���� ô��������ڶ��������������� 3����ô������������������������������������� �������(switch)*/
import java.util.Scanner;
public class Weekend{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("��������������1~7����");
		int week=input.nextInt();
		switch(week){
			case 1:
				System.out.println("����һ");
			break;
			case 2:
				System.out.println("���ڶ�");
			break;
			case 3:
				System.out.println("������");
			break;
			case 4:
				System.out.println("������");
			break;
			case 5:
				System.out.println("������");
			break;
			case 6:
				System.out.println("������");
			break;
			case 7:
				System.out.println("������");
			break;
			default:
				System.out.println("�������");
		}
		
	}
}