/*5������һ�������������� n ��Сʱ������ n ��Сʱ���ڶ�����
����ٸ�Сʱ���������룺25����ô�����1 ���� 1 ��Сʱ��*/
import java.util.Scanner;
public class demo05{
	public static void main(String[]args){
	Scanner input=new Scanner(System.in);
	System.out.println("�������ж��ٸ�Сʱ��");
	int hours =input.nextInt();
	int day=hours/24;
	int hour=hours%24;
	System.out.println(day+"����"+hour+"��Сʱ");
	}
}