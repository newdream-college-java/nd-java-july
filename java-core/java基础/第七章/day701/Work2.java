/*1.2��ѭ�������ַ���������Щ������ַ���������������ֱ��������ַ���Ϊ��Esc��
�ͽ���ѭ���������ʾ��������������ַ�����
���磺���� abc ���� def ���� Esc
����� abcdef*/
import java.util.Scanner;
public class Work2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String sum="";	//����һ�����ַ���
		while(true){
			System.out.print("�������ַ�����");
			String s = sc.next();
			//System.out.println(sum);	//�ж�sum���Ƿ���Esc
			if(s.indexOf("Esc")!=-1){
				break;
			}
			sum = sum+s;
		}
		System.out.println("�ַ���Ϊ��"+sum);
	}
}