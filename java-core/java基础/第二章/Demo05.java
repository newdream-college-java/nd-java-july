/*����һ�������������� n ��Сʱ������ n ��Сʱ���ڶ���������ٸ�Сʱ���������룺
25����ô�����1 ���� 1 ��Сʱ��
*/
import java.util.Scanner;
public class Demo05{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������һ������n��");
		int n = input.nextInt();
		int a = n%24;
		n=n-a;
		int d = n/24;
		System.out.println(d+"����"+a+"��Сʱ��");
	}
}