/*
5������һ�������������� n ��Сʱ������ n ��Сʱ���ڶ���������ٸ�Сʱ���������룺 25����ô�����1 ���� 1 ��Сʱ�� 
*/
import java.util.Scanner;
public class Demo05{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��������");
		int n = input.nextInt();
		int days= n/24;
		int hours = n%24;
		System.out.print(days+"����"+hours+"��Сʱ");
	}
}