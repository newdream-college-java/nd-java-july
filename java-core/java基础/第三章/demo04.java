/*4�����"�㰮����",����ش����"yes",�����"���ǰ��ҵ�",����ش����"no",�����"ԭ��
�㲻����",����ش���������������"�㵽���ǰ����ǲ������Լ�Ҳ�����".*/
import java.util.Scanner;
public class demo04{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		String m1="yes";
		String m2="no";
		System.out.println("�㰮����");
		String a = input.next();
		if(a.equals(m1)){
			System.out.println("���ǰ��ҵ�");
		}else if(a.equals(m2)){
			System.out.println("ԭ���㲻����");
		}else{
			System.out.println("�㵽���ǰ����ǲ������Լ�Ҳ�����");
		}
	}
}