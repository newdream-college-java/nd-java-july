/*1.5������һ������ n����� n ���� 0��
�����:1+1/2+1/3+...+1/n������������������*/
import java.util.Scanner;
public class Work5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ����������");
		int a = sc.nextInt();
		double sum = 0;
		while(true){
			if(a>0){
				break;
			}
			System.out.print("�������������һ����������");
			a = sc.nextInt();
		}
		for(int i =1;i<=a;i++){
			sum = sum+1.0/i;
		}
		System.out.println("��Ϊ��"+sum);
	}
}