/*
1.4���û��������޴ε��������֣���ͳ���û�����������������ĸ���������
�ĸ�����0 �ĸ�����ֱ���û����� 999 �ͽ��������ͳ�ƽ��
*/
import java.util.Scanner;
public class Demo04{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//��ʾ��
		System.out.print("������һ����������999��������");
		int a = input.nextInt();
		int b = 0;
		int c = 0;
		int d = 0;
		while(a!=999){
			//�ж�����ķ�������
			if(a==0){
				b++;
			}
			if(a>0){
				c++;
			}
			if(a<0){
				d++;
			}
			System.out.print("���������     ����999��������");
			a = input.nextInt();
		}
		System.out.println("��������"+b+"���㡢"+c+"��������"+d+"��������");
	}
}