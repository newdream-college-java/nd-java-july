/*1.2��ѭ�������ַ���������Щ������ַ���������������ֱ��������ַ���Ϊ��Esc��
�ͽ���ѭ���������ʾ��������������ַ�����
���磺���� abc ���� def ���� Esc����� abcdef*/
import java.util.Scanner;
public class Demo02{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		String sum="";
		while(true){
			System.out.print("�������ַ�����");
			String a=input.next();
			if(a.equals("Esc")){
				break;
			}else{
				sum+=a;
			}
		}
		System.out.println("�����������ַ���Ϊ��"+sum);
	}	
}