/*1.7��ѭ��������� 0 �����ֽ����ۼӣ�
ֱ�����������Ϊ 0���ͽ���ѭ�������������ۼӵĽ����*/
import java.util.*;
public class Demo07{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int sum=0;
		while(true){
			System.out.print("������һ��������������0��ֹ����");
			int a=input.nextInt();
			if(a>0){
				sum+=a;
			}else if(a==0){
				break;
			}else{
				System.out.print("����������������롣");
			}
		}
		System.out.println("�������ֵĺ�Ϊ��"+sum);
	}
}