import java.util.Scanner;
public class hw2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("�������Ա�������Ѵ���:");
		int a=sc.nextInt();
		double b[]=new double[a];
		double sum=0;
		System.out.print("�������Ա���µ����Ѽ�¼");
		for(int i=1;i<=a;i++){
			System.out.print("�������"+i+"�ʹ����");
			b[i-1]=sc.nextDouble();
			sum+=b[i-1];
		}
		System.out.println("���\t\t\t���");
		for(int i=1;i<=a;i++){
			System.out.println(i+"\t\t\t"+b[i-1]);
		}
		System.out.print("�ܽ��\t\t\t"+sum);
	}
}