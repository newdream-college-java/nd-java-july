/*1.4��ѭ���ʡ�������ֽ�ʲô����������ش���ǡ��������㡱���ͼ����ʣ�
����������������ԭ���У�**�������ʵ�֡�*/
import java.util.Scanner;
public class Work4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a ;
		do{
			System.out.println("������ֽ�ʲô��");
			a = sc.next();
		}while(a.equals("��������"));
		System.out.println("ԭ��������ֽ�"+a);
	}
}