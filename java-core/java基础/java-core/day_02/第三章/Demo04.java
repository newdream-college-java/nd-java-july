/*4�����"�㰮����",����ش����"yes",�����"���ǰ��ҵ�",����ش����"no",�����"ԭ�� �㲻����",����ش���������������"�㵽���ǰ����ǲ������Լ�Ҳ�����".*/
import java.util.*;
public class Demo04{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("�㰮����");
		String s=in.next();
		if(s.equals("yes")){
			System.out.println("���ǰ��ҵ�");
		}else if(s.equals("no")){
			System.out.println("ԭ���㲻����");
		}else    {System.out.println("�㵽���ǰ����ǲ������Լ�Ҳ�����");
		}	
	}
}