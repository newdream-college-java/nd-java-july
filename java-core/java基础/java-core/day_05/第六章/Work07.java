/*1.7��ѭ��������� 0 �����ֽ����ۼӣ� ֱ�����������Ϊ 0���ͽ���ѭ�������������ۼӵĽ����*/
import java.util.Scanner;
public class Work07{
	public static void main(String[] args ){
		Scanner sc= new Scanner(System.in);
		System.out.print("������������ӣ�����0������");
		double sum=0;
		for(;;){
			
			double a=sc.nextDouble();
			if(a==0){
				break;
			}
			sum+=a;
		}
		System.out.println("����������ֺ�Ϊ��"+sum);
	}
}