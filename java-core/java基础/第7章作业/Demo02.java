/*ѭ�������ַ���������Щ������ַ���������������ֱ��������ַ���Ϊ��Esc��
�ͽ���ѭ���������ʾ��������������ַ�����*/
import java.util.*;
public class Demo02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("�������ַ�����");
		String a=input.next();
		String sum="";
		while(!a.equals("Esc")){
			sum+=a;
			System.out.print("�������ַ�����");
			a=input.next();
		}
		System.out.println("��������ַ����ǣ�"+sum);
		System.out.println("���������");
	}
}