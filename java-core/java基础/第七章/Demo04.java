/*1.4���û��������޴ε��������֣���ͳ���û�����������������ĸ���������
�ĸ�����0 �ĸ�����ֱ���û����� 999 �ͽ��������ͳ�ƽ��*/
import java.util.*;
public class Demo04{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		int sum1=0;
		int sum2=0;
		int sum3=0;
		while(true){
			System.out.print("������һ�����֣�����999�����������");
			int a=input.nextInt();
			if(a==999){
				break;
			}else if(a==0){
				sum1++;
			}else if(a>0){
				sum2++;
			}else{
				sum3++;
			}
		}
		System.out.println("�����ĸ���Ϊ��"+sum2);
		System.out.println("�����ĸ���Ϊ��"+sum3);
		System.out.println("0�ĸ���Ϊ��"+sum1);
	} 
}