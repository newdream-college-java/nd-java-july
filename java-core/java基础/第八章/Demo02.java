/*1.2�� ѭ������ 5 ��ѧ���ĳɼ�,ͳ���ж����˵ĳɼ����� 80 ��,Ҫ��ʹ��
continue �����ɡ�*/
import java.util.Scanner;
public class Demo02{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		int count=0;
		for(int i=1;i<=5;i++){
			System.out.print("�������"+i+"��ѧ���ĳɼ���");
			int score=input.nextInt();
			if(score<=80){
				continue;
			}
			count++;
		}
		System.out.println("��"+count+"���˵ĳɼ����� 80 ��");
	}
}