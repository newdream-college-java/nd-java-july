/*1.8��ѭ������ 5 ��ѧ���ĳɼ�,ͳ���ж����˵ĳɼ����� 80 ��,Ҫ��ʹ�� continue
�����ɡ�*/
import java.util.*;
public class Demo08{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int count=0;
		for(int i=1;i<=5;i++){
			System.out.print("������ѧ���ĳɼ���0-100����");
			int score=input.nextInt();
			if(score<0||score>100){
				System.out.print("�������");
				i--;
				continue;
			}
			if(score>80){
				count++;
			}
		}
		System.out.println("�ɼ����� 80 �ֵ�ѧ������Ϊ��"+count);
	}
}