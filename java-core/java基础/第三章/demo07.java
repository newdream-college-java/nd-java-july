/*7�������� GoodLuck ʵ�����˳齱���齱����
��Ա�ŵİ�λ���ֵ��ڲ�����������ּ�Ϊ���˻�Ա*/
import java.util.Scanner;
import java.util.Random;
public class demo07{
	public static void main(String []args){
		Random r=new Random();
		Scanner input=new Scanner(System.in);
		System.out.println("������4λ��Ա�ţ�");
		int a = input.nextInt();
		int b=r.nextInt(10);	
		System.out.println("�����������Ϊ��"+b);
		if((a/100%10)==b){
			System.out.println(a+"�ſͻ������˿ͻ�����þ���Mp3һ����");
		}else{
			System.out.println(a+"�ſͻ�,лл����֧�֣�");
		}
	}
}