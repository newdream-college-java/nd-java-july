/*1.8��ѭ������ 5 ��ѧ���ĳɼ�,ͳ���ж����˵ĳɼ����� 80 ��,Ҫ��ʹ�� continue �����ɡ�*/
import java.util.*;
public class H{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int count=0;
		for(int i=1;i<=5;i++){
			System.out.println("��"+i+"λͬѧ�ĳɼ�Ϊ��");
			int a=input.nextInt();
			if(a<=80){
				continue;
			}
			count++;
		}
		System.out.println("�ɼ�����80�ֵ���"+count+"��");
	}
}