/*2.5�� ������� 1 �� 1 �յ��������������*/
import java.util.Scanner;
public class Work6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("�������·ݣ�");
		int a = sc.nextInt();
		System.out.print("���������ڣ�");
		int sum = sc.nextInt();
		switch(a){
			case 12:
				sum = sum+30;
			case 11:
				sum = sum+31;
			case 10:
				sum = sum+30;
			case 9:
				sum = sum+31;
			case 8:
				sum = sum+31;
			case 7:
				sum = sum+30;
			case 6:
				sum = sum+31;
			case 5:
				sum = sum+30;
			case 4:
				sum = sum+31;
			case 3:
				sum = sum+29;
			case 2:
				sum = sum+31;
			case 1:
				break;
			default:
				System.out.println("û������·ݣ�");

		}
		System.out.print("����Ϊ��"+sum);
	}
}