/*1.5������ 10 ��ѧ���ĵ��Ƴɼ�����ɼ��� 60 ������(����)��60~80 ��(�� 60 ���� 80)
�� 80 ������ ��ѧ�����ж��ٸ�?�������߷֡���ͷֺ�ƽ����*/
import java.util.*;
public class Demo05{
	public static void main(String [] args){
		Scanner input =new Scanner(System.in);
		double [] score=new double[10];
		int sum1=0;
		int sum2=0;
		for(int i=0;i<10;i++){
			System.out.print("�������"+(i+1)+"λѧ���ĳɼ���");
			score[i]=input.nextDouble();
			if(score[i]<60){
				sum1++;
			}else if(score[i]>=80){
				sum2++;
			}
		}
		System.out.println("�ɼ��� 60 ������(����)���У�"+sum1+"��");
		System.out.println("�ɼ��� 60~80 ��(�� 60 ���� 80)���У�"+(10-sum1-sum2)+"��");
		System.out.println("�ɼ��� 80 �����ϵ��У�"+sum2+"��");
	}	
}