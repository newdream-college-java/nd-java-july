/*2������һ���������������εı߳�������������ε��ܳ����������*/
import java.util.Scanner;
public class Demo02{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		System.out.print("�����������εı߳���");
		int a=input.nextInt();
		int c,s;
		c=2*(2*a);
		s=a*a;
		System.out.println("�߳�\t�ܳ�\t�����");	
		System.out.println(a+"\t"+c+"\t"+s);	
	}
}