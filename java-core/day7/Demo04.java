import java.util.Scanner;
public class Demo04{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		/*1.5������һ������ n����� n ���� 0��
�����:1+1/2+1/3+...+1/n������������������*/
		double data=input.nextDouble();
		double sum=0;
		if(data<0){
			System.out.println("���������");
			return;
		}
		for(int i=1;i<=data;i++){
			sum+=(1/data);
		}
		System.out.println("��Ϊ"+sum);
	}
}