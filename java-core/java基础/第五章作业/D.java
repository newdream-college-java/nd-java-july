/*1.4��ѭ���ʡ�������ֽ�ʲô����������ش���ǡ��������㡱���ͼ����ʣ�����������������ԭ���У�**�������ʵ�֡�*/
import java.util.*;
public class D{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������ֽ�ʲô��");
		String s1=input.next();
		String s2="��������";
		while(s1.equals(s2)){
			System.out.println("������ֽ�ʲô��");
			s1=input.next();
		}
		System.out.println("ԭ��������ֽ�"+s1);
	}
}