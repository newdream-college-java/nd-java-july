import java.util.Scanner;

/*1.5������ 10 ��ѧ���ĵ��Ƴɼ�����ɼ��� 60 ������(����)��60~80 ��(�� 60 ���� 80)
�� 80 ������ ��ѧ�����ж��ٸ�?�������߷֡���ͷֺ�ƽ����*/

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double[] scores=new double[10];
		int count1=0,count2=0,count3=0;
		double sum=0;
		System.out.println("������ѧ���ĳɼ���");
		for (int i = 0; i < scores.length; i++) {
			System.out.print("��"+(i+1)+"��ͬѧ�ĳɼ�Ϊ��");
			scores[i]=input.nextDouble();
			if (scores[i]<60) {
				count1++;
			}else if (scores[i]>=60&&scores[i]<80) {
				count2++;
			}else{
				count3++;
			}
			sum+=scores[i];
		}
		double max=scores[0],min=scores[0];
		for (int i = 1; i < scores.length; i++) {
			max=max<scores[i]?scores[i]:max;
		}
		for (int i = 1; i < scores.length; i++) {
			min=min>scores[i]?scores[i]:min;
		}
		System.out.println("ѧ���ɼ�60������������"+count1+"\n"+"ѧ���ɼ�60������80������������"+count2+"\n"+"ѧ���ɼ�80������������"+count3+"\n"+"ƽ����Ϊ��"+sum/10.0+"\n"+"���ֵΪ��"+max+"\n"+"��СֵΪ:"+min);
	}

}
