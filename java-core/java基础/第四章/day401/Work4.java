/*2.3������һ�����֣������������� 1����ô�������һ�������������� 2���� ô��������ڶ��������������� 3����ô������������������������������������� �������(switch)*/
import java.util.Scanner;
public class Work4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ�����֣�");
		int x = sc.nextInt();
		switch(x){
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
				System.out.println("û����һ�죡");
		}
	}
}