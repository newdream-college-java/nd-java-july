/*
1.8��ѭ������ 5 ��ѧ���ĳɼ�,ͳ���ж����˵ĳɼ����� 80 ��,Ҫ��ʹ�� continue
�����ɡ�
*/
import java.util.*;
public class Demo08{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		int count=0;
		for(int i =1;i<=5;i++){
			System.out.print("�������"+i+"��ѧ���ĳɼ�Ϊ��");	
			double score = input.nextDouble();
			if(score>80&&score<=100){
				count+=1;
			}
			else if(score<0||score>100){
				System.out.println("�������");
				i--;
				continue;
			}
		}
		System.out.print("����"+count+"�˳ɼ�����80��");
	}
}