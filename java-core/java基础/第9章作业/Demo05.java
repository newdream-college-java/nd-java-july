import java.util.Scanner;
/*
 ���� 10 ��ѧ���ĵ��Ƴɼ�����ɼ��� 60 ������(����)��60~80 ��(�� 60 ���� 80)
�� 80 ������ ��ѧ�����ж��ٸ�?�������߷֡���ͷֺ�ƽ���� 
 */
public class Demo05 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double arr[]=new double[10];
		int count1=0,count2=0,count3=0;
		double sum=0;
		System.out.println("������10��ͬѧ�ĵ��Ƴɼ���");
		for(int i=0;i<arr.length;i++){
			System.out.print("�������"+(i+1)+"λͬѧ�ĳɼ���");
			arr[i]=input.nextDouble();
			sum+=arr[i];
			if(arr[i]<60){
				count1++;
			}else if(arr[i]>=80){
				count3++;
			}else{
				count2++;
			}
		}
		double max=arr[0];
		double min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
				continue;
			}
		}
		for(int i=0;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
				continue;
			}
		}
		System.out.println("�ɼ���60�����µ�����Ϊ��"+count1);
		System.out.println("�ɼ���60��~80�֣���60��������Ϊ��"+count2);
		System.out.println("�ɼ���80�����ϵ�����Ϊ��"+count3);
		System.out.println("��߷�Ϊ��"+max);
		System.out.println("��ͷ�Ϊ��"+min);
		System.out.println("ƽ����Ϊ��"+sum/10);
	}
}
