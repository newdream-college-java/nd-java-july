/*1.5������һ������ n����� n ���� 0�������:1+1/2+1/3+...+1/n������������������*/
import java.util.Scanner;
public class Work05{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("������һ��������");
		int a=sc.nextInt();
		double sum=0;
		if(a<=0){
			System.out.println("�������");
		}else {
			for(int i=1;i<=a;i++){
				sum=sum+1.0/i;
			}
		System.out.println("��Ϊ"+sum);
		}	
	}
}