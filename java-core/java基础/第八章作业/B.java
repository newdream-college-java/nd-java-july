/*1.2�� ѭ������ 5 ��ѧ���ĳɼ�,ͳ���ж����˵ĳɼ����� 80 ��,Ҫ��ʹ��
continue �����ɡ�*/
import java.util.*;
public class B{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int count=0;
		for(int i=1;i<=5;i++){
			System.out.print("��"+i+"Ϊͬѧ�ķ���Ϊ��");
			int score=input.nextInt();
			if(score<=80){
				continue;
			}
			count++;
		}
		System.out.println("����80�ֵ���"+count+"��");		
	}	
}