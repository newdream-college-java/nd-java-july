/*1.2��ѭ�������ַ���������Щ������ַ���������������ֱ��������ַ���Ϊ��Esc��
�ͽ���ѭ���������ʾ��������������ַ�����
���磺���� abc ���� def ���� Esc
����� abcdef*/
import java.util.*;
public class B{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
 		String s="";
		while(true){
			System.out.print("�������ַ�����");
			String a=input.next();
			if(a.equals("Esc")){
				System.out.println("���Ӻ���ַ���Ϊ��"+s);
				break;
			}else{
				s+=a;
			}

		}

	}
}