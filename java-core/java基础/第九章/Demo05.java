/*
1.5������ 10 ��ѧ���ĵ��Ƴɼ�����ɼ��� 60 ������(����)��60~80 ��(�� 60 ���� 80)
�� 80 ������ ��ѧ�����ж��ٸ�?�������߷֡���ͷֺ�ƽ���� 
*/
import java.util.*;
public class Demo05{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double sum = 0;
		double[] score = new double[10];
		double max = score[0];
		double min = 100s.0;
		int a = 0;
		int b = 0;
		int c = 0;
		for(int i= 0;i<score.length;i++){
			System.out.print("�������"+(i+1)+"��ѧ���ĳɼ���");
			score[i] = input.nextDouble();
			sum+=score[i];
			if(score[i]>max){
				max = score[i];
			}
			if(score[i]<min){
				min = score[i];
			}
			if(score[i]<60){
				a++;
			}else if(score[i]>=60&&score[i]<80){
				b++;
			}else{
				c++;
			}
		}
		System.out.println("�ɼ���60�����µ��У�"+a+"��");
		System.out.println("�ɼ���60~80�ֵ��У�"+b+"��");
		System.out.println("�ɼ���80�����ϵ��У�"+c+"��");
		System.out.println("��߷֣�"+max+"��ͷ֣�"+min+"ƽ���֣�"+sum/10.0);
	}
}