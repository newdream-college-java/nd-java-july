/*	ѭ��������� 0 �����ֽ����ۼӣ�
	ֱ�����������Ϊ 0���ͽ���ѭ�������������ۼӵĽ����
*/

import java.util.Scanner;

public class G{
	public static void main (String [] args){
		Scanner input =new Scanner(System.in);
		int a=input.nextInt();
		int sum=0;
		if(a<0){
			System.out.println("������󣡣���");
			System.exit(-1);
		}
		while(a>=0){
			sum=sum+a;
			a=input.nextInt();
			if(a==0){
				System.out.println("������Ϊ0���˳�ѭ��");
				break;
			}
		}
		System.out.println("�ۼӵĽ��Ϊ��"+sum);
	}
}