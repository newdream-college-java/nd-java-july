import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		/*1.2��ѭ�������ַ���������Щ������ַ���������������ֱ��������ַ���Ϊ��Esc�ͽ���ѭ���������ʾ��������������ַ�����
���磺���� abc ���� def ���� Esc
  ����� abcdef*/
		Scanner input=new Scanner(System.in);
		System.out.println("�����ַ���,����Щ������ַ�������������,Esc�ͽ���");
		String data;
		String sum="";
		for(;;){
			data=input.next();
			if(data.equals("Esc")){
				System.out.println();
				break;
			}
			sum+=data;	
		}
		System.out.println(sum);
	}
}