/*1.4���û��������޴ε��������֣���ͳ���û�����������������ĸ���������
�ĸ�����0 �ĸ�����ֱ���û����� 999 �ͽ��������ͳ�ƽ��*/
import java.util.Scanner;
public class Work04{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int count_z=0;
		int count_f=0;
		int count_0=0;
		for(;;){
			System.out.println("���������֣�");
			double a=sc.nextDouble();
			if(a==0){
				count_0++;
			}else if(a==999){
				break;
			}else if(a<0){
				count_f++;
			}else {
				count_z++;
			}
		}
		System.out.println("�����ĸ�����"+count_z);
		System.out.println("�����ĸ�����"+count_f);
		System.out.println("0�ĸ�����"+count_0);
	}
}