/*1.5������һ������ n����� n ���� 0��
�����:1+1/2+1/3+...+1/n������������������*/
import java.util.*;
public class Demo05{
	public static void main(String [] args){
		Scanner input= new Scanner(System.in);
		System.out.print("������һ������ n:");
		int n=input.nextInt();
		double sum=0;
		if(n>0){
			for(int i=1;i<=n;i++){
				sum+=(1.0/i);
			}
		}else{
			System.out.println("�������");
		}
		System.out.println("���Ϊ��"+sum);
	}
}