/*
4�����"�㰮����",����ش����"yes",�����"���ǰ��ҵ�",����ش����"no",�����"ԭ��
�㲻����",����ش���������������"�㵽���ǰ����ǲ������Լ�Ҳ�����
*/
import java.util.Scanner;
public class Demo04{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�㰮���𣿣�yes/no��");
		String answer = input.next();
		if(answer.equals("yes")){
			System.out.println("�㰮�Ұ�");
		}
		else if(answer.equals("no")){
			System.out.println("�㲻���Ұ�");
		}
		else{
			System.out.println("�㵽�װ������Ұ�");
		}
		
	}
}