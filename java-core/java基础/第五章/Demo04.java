/*1.4��ѭ���ʡ�������ֽ�ʲô����������ش���ǡ��������㡱���ͼ����ʣ�
����������������ԭ���У�**�������ʵ�֡�*/
import java.util.Scanner;
public class Demo04{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("������ֽ�ʲô��");
		String hd=input.next();
		while(hd.equals("��������")){
			System.out.println("������ֽ�ʲô��");
			hd=input.next();
		}
		System.out.println("�������ԭ���У�"+hd);
	}
}