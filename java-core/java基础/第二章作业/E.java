/*������һ�������������� n ��Сʱ������ n ��Сʱ���ڶ���������ٸ�Сʱ��
�������룺 25����ô�����1 ���� 1 ��Сʱ�� */

import java.util.Scanner;

public class E{
	public static void main (String[] args){
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	int day,hours;
	day=n/24;
	hours=n%24;
	System.out.println(day+"����"+hours+"��Сʱ");
	}
}