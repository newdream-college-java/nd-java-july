/*����һ���������������εı߳�������������ε��ܳ��������*/
import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("�����������εı߳���");
		int a = input.nextInt();
		int area = a*a;
		int perimeter = 4*a;
		System.out.println("�ܳ�Ϊ��"+perimeter);
		System.out.println("���Ϊ:"+area);
		
	}
}