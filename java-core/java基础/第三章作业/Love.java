/*4�����"�㰮����",����ش����"yes",�����"���ǰ��ҵ�",����ش����"no",�����"ԭ��
�㲻����",����ش��������������� �㵽���ǰ����ǲ������Լ�Ҳ�����".*/
import java.util.Scanner;
public class Love{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("�㰮����");
		String s=input.next();
		if(s.equals("yes")){
			System.out.println("���ǰ��ҵģ�");
		}else if(s.equals("no")){
			System.out.println("�㲻���ң�");
		}else {
			System.out.println("�㵽���ǰ����ǲ������Լ�Ҳ�����");
		}
	}
}