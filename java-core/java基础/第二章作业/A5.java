/*����һ�������������� n ��Сʱ������ n ��Сʱ���ڶ���������ٸ�Сʱ���������룺
25����ô�����1 ���� 1 ��Сʱ��*/
import java.util.Scanner;
public class A5{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������");
		int a = input.nextInt();
		if(a<24){
			System.out.println(a+"��Сʱ");
		}else System.out.println(a/24+"����"+a%24+"��Сʱ");
	}
}