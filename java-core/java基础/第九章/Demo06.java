/*1.6���Ӽ��������� 10 ���������Ϸ�ֵΪ 1��2��3�������� 3 ������Ϊ�Ƿ����֡�
���ͳ��ÿ�� �����ͷǷ����ֵĸ�����*/
import java.util.*;
public class Demo06{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		int [] a=new int[10];
		int sum1=0;
		int sum2=0;
		for(int i=0;i<10;i++){
			System.out.print("�������"+(i+1)+"λ������");
			a[i]=input.nextInt();
			if(a[i]==1||a[i]==2||a[i]==3){
				sum1++;
			}else{
				sum2++;
			}
		}
		System.out.println("�Ϸ�ֵ�У�"+sum1+"��");
		System.out.println("�Ƿ������У�"+sum2+"��");
	}	
}