/*
1.7��ѭ��������� 0 �����ֽ����ۼӣ�
ֱ�����������Ϊ 0���ͽ���ѭ�������������ۼӵĽ��
*/
import java.util.Scanner;
public class Demo07{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int n;
		do{
			System.out.print("�����루��0��������");
			 n = input.nextInt();
			sum+=n;
		}while(n != 0);
		System.out.println("������Ϊ��"+sum);
	}
}