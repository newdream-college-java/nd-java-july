/*2.4���������������������������������ȣ���ô�����
i����������ȡ��������� �ж���������֮���Ƿ���� 1000��������� 1000 �������������֮�ʹ��� 1000�� �����������������֮�Ͳ����� 1000����*/
import java.util.Scanner;
public class Work5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int [] a = new int[3];
		for(int i=0;i<3;i++){
			System.out.print("�������  "+ (i+1 )+"  ������");

			a[i] = sc.nextInt();
		}
		if(a[0]==a[1]&&a[1] ==a[2] ){
			System.out.print("�����������");	
		}else if(a[0]+a[1]+a[2]>1000){
			System.out.print("��������֮�ʹ��� 1000");	
		}else if(a[0]+a[1]+a[2]<1000){
			System.out.print("��������֮�Ͳ����� 1000");	
		}
		
	}
}