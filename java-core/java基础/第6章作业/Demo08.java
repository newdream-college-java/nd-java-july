/*ѭ������ 5 ��ѧ���ĳɼ�,ͳ���ж����˵ĳɼ����� 80 ��,Ҫ��ʹ�� continue
�����ɡ�*/
import java.util.*;
public class Demo08{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int count=0;
		for(int i=1;i<=5;i++){
			System.out.print("�������"+i+"λͬѧ�ĳɼ���");
			double a=input.nextDouble();
			if(a>80){
				count++;
				continue;
			}
		}
		System.out.println("�ɼ�����80�ֵ���"+count+"��ͬѧ");
	}
}