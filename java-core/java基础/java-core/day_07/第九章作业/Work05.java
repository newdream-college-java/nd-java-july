/*1.5������ 10 ��ѧ���ĵ��Ƴɼ�����ɼ��� 60 ������(����)��60~80 ��(�� 60 ���� 80)�� 80 ������ ��ѧ�����ж��ٸ�?�������߷֡���ͷֺ�ƽ����*/
import java.util.*;
public class Work05{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		double[] score=new double[10];
		double a=0,b=0,c=0,sum=0;
		for(int i=0;i<score.length;i++){
			System.out.print("�������"+(i+1)+"��ѧ���ĳɼ���");
			score[i]=in.nextDouble();
			if(score[i]<60){
				a++;
			}else if(score[i]>=60&&score[i]<80){
				b++;
			}else {
				c++;
			}
			sum+=score[i];
		}
		double max=score[0],min=score[0];
		for(int i=1;i<score.length;i++){
			if(max<score[i]){
				max=score[i];
			}
			if(min>score[i]){
				min=score[i];
			}
		}
		System.out.println("60 ������(����)���У�"+a+"��");
		System.out.println("60~80 ��(�� 60 ���� 80)���У�"+b+"��");
		System.out.println("80 �����ϵ��У�"+c+"��");
		System.out.println("��߷��ǣ�"+max);
		System.out.println("��ͷ��ǣ�"+min);
		System.out.println("ƽ�����ǣ�"+sum/score.length);
		
	}
}