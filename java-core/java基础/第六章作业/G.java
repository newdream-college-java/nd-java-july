/*1.7��ѭ��������� 0 �����ֽ����ۼӣ� ֱ�����������Ϊ 0���ͽ���ѭ�������������ۼӵĽ����*/
import java.util.*;
public class G{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("���������֣�");
		int a=input.nextInt();
		int sum=0;
		while(a!=0){
			sum+=a;
			System.out.print("���������֣�");
			a=input.nextInt();
		}
		System.out.println("�ܺ�Ϊ��"+sum);
	}
}