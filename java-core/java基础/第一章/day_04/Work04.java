/*1.4��ѭ���ʡ�������ֽ�ʲô����������ش���ǡ��������㡱���ͼ����ʣ�����������������ԭ���У�**�������ʵ�֡�*/
import java.util.Scanner;
public class Work04{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s;
		do{
			System.out.println("������ֽ�ʲô��");
			s=sc.next();
		}while(s.equals("��������"));
		System.out.println("�������ԭ����"+s);
	}
}