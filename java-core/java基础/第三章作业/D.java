/*���"�㰮����",����ش����"yes",�����"���ǰ��ҵ�",
����ش����"no",�����"ԭ�� �㲻����",����ش����������
�����"�㵽���ǰ����ǲ������Լ�Ҳ�����".  */

import java.util.Scanner;

public class D{
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("�㰮����:");
		String a=input.next();
		if(a.equals("yes")){
		System.out.println("���ǰ��ҵ�");
		}else if(a.equals("no")){
		System.out.println("ԭ�� �㲻����");
		}else{
		System.out.println("�㵽���ǰ����ǲ������Լ�Ҳ�����");
		}
	}
}