/*1.7��ѭ��������� 0 �����ֽ����ۼӣ� ֱ�����������Ϊ 0���ͽ���ѭ�������������ۼӵĽ����*/
import java.util.Scanner;
public class Work7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true){
			System.out.println("���������֣�");
			int a = sc.nextInt();
			if(a>0){
				sum+=a;
			}else if(a==0){
				break;
			}else
				System.out.println("�������");
			
		}
		System.out.println("����������ֺ�Ϊ��"+sum);
	}
}