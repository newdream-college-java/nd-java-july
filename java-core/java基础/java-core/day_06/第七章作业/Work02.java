/*1.2��ѭ�������ַ���������Щ������ַ���������������ֱ��������ַ���Ϊ��Esc���ͽ���ѭ���������ʾ��������������ַ��������磺���� abc ���� def ���� Esc����� abcdef*/
import java.util.Scanner;
public class Work02{
	public static void main(String [] args ){
		Scanner sc=new Scanner(System.in);
		String sum="";
		for(int i=1;;i++){
			System.out.print("�������"+i+"���ַ�����");
			String s=sc.next();
			if(s.equals("Esc")){
				break;
			}
			sum+=s;
			
		}
		System.out.println(sum);
	}
}