/*	
	����һ������ n����� n ���� 0��
	�����:1+1/2+1/3+...+1/n��
	����������������
*/
import java.util.Scanner;

public class E{
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		double sum=0;
		//�ж�a�ķ�Χ
		if(a>0){
			//��a�ݼ����ڽ�1/a���ӵ�sum��
			for(int i=a;i>0;i--)  
			sum=sum+1.0/i;   
		}else{
			System.out.println("������󣡣���");
		}
		System.out.println("�ܺ�Ϊ��"+sum);
	}
}