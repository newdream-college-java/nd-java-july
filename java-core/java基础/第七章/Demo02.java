/*
1.2��ѭ�������ַ���������Щ������ַ���������������ֱ��������ַ���Ϊ��Esc��
�ͽ���ѭ���������ʾ��������������ַ����� 
���磺���� abc      ���� def        ���� Esc 
      ����� abcdef 
*/
import java.util.*;
public class Demo02{
	public static void main (String []args){
		Scanner input = new Scanner(System.in);
		String result="";
		while(true){
			System.out.print("����");
			String a = input.next();
			if(!a.equals("Esc")){
				result+=a;
					
			}else{
				System.out.print("���Ϊ��"+result);
				break;
			}
		}
	}
}