/*ѭ������ 5 ��ѧ���ĳɼ�,ͳ���ж����˵ĳɼ����� 80 ��,Ҫ��ʹ��
continue �����ɡ�*/
import java.util.*;
public class Demo02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int count=0;
		for(int i=1;i<=5;i++){
			System.out.print("�������"+i+"λͬѧ�ĳɼ���");
			double score=input.nextDouble();
			if(score<80){
				continue;
			}
			count++;
		}
		System.out.println("�ɼ�����80�ֵ�����λ��"+count);
	}
}