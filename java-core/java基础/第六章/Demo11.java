/*
2.3���û���¼��֤����֤������� 3 ��
*/
import java.util.Scanner;
public class Demo11{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int i = 2;
		for(;i>=0;i--){
			System.out.print("�������û�����");
			String name = input.next();
			System.out.print("���������룺");
			String password = input.next();
			if(!(name.equals("cxh"))||!(password.equals("cxhcxh"))){
				System.out.println("�������������"+i+"�λ��ᣡ");
				System.out.println("         ");
				continue ;
			}
			if((name.equals("cxh"))&&(password.equals("cxhcxh"))){
				System.out.println("��ӭʹ�ù������ϵͳ��");
				break ;
			}
		}
		if(i == -1){
			System.out.println("�Բ�����3�˾�������󡣳�����ֹ������");
		}
	}
}