/*
1.4��ѭ���ʡ�������ֽ�ʲô����������ش���ǡ��������㡱���ͼ����ʣ�
����������������ԭ���У�**�������ʵ�֡�
*/
import java.util.Scanner;
public class Demo04{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("���ʲô���֣�");
		String a = sc.next();
		while(a.equals("��������")){
			System.out.print("���ʲô���֣�");
			a = sc.next();
		}
		System.out.println("ԭ��������ֽУ�"+a);
	}
}