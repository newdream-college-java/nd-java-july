/*
1.2�� ѭ������ 5 ��ѧ���ĳɼ�,ͳ���ж����˵ĳɼ����� 80 ��,Ҫ��ʹ��
continue ������
*/
import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int sum = 0;
		for(int i = 1;i<=5;i++){
			System.out.print("�������"+i+"��ѧ���ɼ���");
			int score = input.nextInt();
			if(score>80){
				sum++;
				continue ;
			}
		}
		System.out.println("��"+sum+"��ѧ���ɼ�����80�֡�");
	}
}