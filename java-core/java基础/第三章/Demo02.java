/*
2������һ����ݣ��������껹��ƽ��
*/
import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������һ����ݣ�");
		int n = input.nextInt();
		
		if((n%4==0&&n%100!=0)||(n%400==0))
			System.out.println("�������꣡");
		else
			System.out.println("�ⲻ�����꣡");
	}
}