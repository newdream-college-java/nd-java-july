/*
1.7��ѭ��������� 0 �����ֽ����ۼӣ�
ֱ�����������Ϊ 0���ͽ���ѭ�������������ۼӵĽ����
*/
import java.util.*;
public class Demo07{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		int sum =0;
		while(true){
			System.out.print("����������");
			double a = input.nextDouble();
			if(a>0){
				sum+=a;
			}
			else if (a==0){
				System.out.print("��Ϊ��"+sum);
				break;
			}
			else {
				System.out.println("���Ǹ�����");
			}
		}
	}
}