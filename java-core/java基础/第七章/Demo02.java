/*
1.2��ѭ�������ַ���������Щ������ַ���������������ֱ��������ַ���Ϊ��Esc��
�ͽ���ѭ���������ʾ��������������ַ�����
���磺���� abc ���� def ���� Esc
 ����� abcdef
*/
import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String sum = "";
		System.out.print("������һ���ַ���");
		String a = input.next();
		while(!(a.equals("Esc"))){	
			sum+=a;
			System.out.print("��������룺");
			a =input.next();
		}	
		System.out.println("������Ϊ��"+sum);	
	}
}