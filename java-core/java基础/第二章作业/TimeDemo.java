/*5������һ�������������� n ��Сʱ������ n ��Сʱ���ڶ���������ٸ�Сʱ���������룺25����ô�����1 ���� 1 ��Сʱ��*/
import  java.util.Scanner;
public class TimeDemo{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������ʱ�䣺");
		int time=input.nextInt();
		int day,hour;
		day=time/24;
		hour=time%24;
		System.out.println("�����ʱ�䣨Сʱ��\t����\tʣ��ʱ�䣨Сʱ��");
		System.out.println(time+"\t\t\t"+day+"\t"+hour);
	}
}