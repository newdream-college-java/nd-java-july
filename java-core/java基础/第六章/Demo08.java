/*
1.8��ѭ������ 5 ��ѧ���ĳɼ�,ͳ���ж����˵ĳɼ����� 80 ��,Ҫ��ʹ�� continue
������
*/
import java.util.Scanner;
public class Demo08{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int sum = 0;
		for(int i = 1;i<=5;){
			System.out.print("��������ķ�����");
			double score = input.nextDouble();
			if(score<0||score>100){
				System.out.println("���������������������롣");
				continue ;
			}
			 if(score>80){
				sum++;	
				i++;
			}
			else{
				i++;
			}
		}
		System.out.println("��"+sum+"�˵ĳɼ�����80�֡�");
	}
}