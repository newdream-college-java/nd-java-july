import java.util.Scanner;
public class D{
	public static void main (String [] args ){
		Scanner input = new Scanner(System.in);
		System.out.println("������һ�����֣�");
		int a  = input.nextInt();
		switch(a){
		case 1:
		System.out.println("��������һ��");
		break;
		case 2:
		System.out.println("�������ڶ���");
		break;
		case 3:
		System.out.println("������������");
		break;
		case 4:
		System.out.println("���������ģ�");
		break;
		case 5:
		System.out.println("���������壡");
		break;
		case 6:
		System.out.println("������������");
		case 7:
		System.out.println("���������죡");
		break;
		default :
		System.out.println("�������");
		}
}
}