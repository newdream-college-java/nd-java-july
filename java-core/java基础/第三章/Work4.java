/*4�����"�㰮����",����ش����"yes",�����"���ǰ��ҵ�",����ش����"no",�����"ԭ��
�㲻����",����ش���������������"�㵽���ǰ����ǲ������Լ�Ҳ�����".*/
import java.util.Scanner;
public class Work4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�㰮����");
		String a = input.next();
		if("yes".equals(a)){
			System.out.println("���ǰ��ҵģ�");
		}else if("no".equals(a)){
			System.out.println("ԭ���㲻���ң�");
		}else System.out.println("�㵽���ǰ����ǲ������Լ�Ҳ�������");
	}
}