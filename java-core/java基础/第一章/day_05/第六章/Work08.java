/*1.8��ѭ������ 5 ��ѧ���ĳɼ�,ͳ���ж����˵ĳɼ����� 80 ��,Ҫ��ʹ�� continue �����ɡ�*/
import java.util.Scanner;
public class Work08{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int i=5;
		int j=5;
		for(;i>=1;i--){
			System.out.print("�������"+(6-i)+"��ͬѧ�ĳɼ���");
			double score=sc.nextDouble();
			if(score>80){
				continue;
			}
			j--;
		}
		System.out.println("�ɼ����� 80 ������"+j+"�ˣ�");
	}
}