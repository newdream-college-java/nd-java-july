/*
8�������� AddCust ¼���Ա��Ϣ,������Ա�š����պͻ����ж�¼��Ļ�Ա���Ƿ�Ϸ�(����Ϊ
4 λ����) 
*/
import java.util.Scanner;
public class Demo08{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�������ع������ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ");
		System.out.println("_____________________________________________________");
		System.out.print("�������Ա�ţ�4λ���֣���");
		int a = input.nextInt();

		System.out.print("�������Ա����/�գ�<����λ����ʾ>��");
		String b = input.next();

		System.out.print("��������֣�");
		int c = input.nextInt();

		System.out.println("_____________________________________________________");
		System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");	
		System.out.println(a+"\t"+b+"\t"+c);
		
	}
}