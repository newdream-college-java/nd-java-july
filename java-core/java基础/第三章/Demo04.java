/*
4�����"�㰮����",����ش����"yes",�����"���ǰ��ҵ�",����ش����"no",�����"ԭ�� �㲻����",����ش���������������"�㵽���ǰ����ǲ������Լ�Ҳ�����". 
*/
import java.util.*;
public class Demo04{
	public static void main(String [] args){
		System.out.println("�㰮����");
		Scanner input = new Scanner(System.in);
		String x = input.next();
		if(x.equals("yes"))
		System.out.print("���ǰ��ҵ�");
		else if(x.equals("no"))
		System.out.print("ԭ�� �㲻����");
		else
		System.out.print("�㵽���ǰ����ǲ������Լ�Ҳ�����");
	}
}