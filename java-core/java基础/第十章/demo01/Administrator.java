package Jul22;

import java.util.Scanner;

public class Administrator {
/*
 *1.1������˵��
��д����Ա��(����:�û���������;����:show()��ʾ����Ա��Ϣ) 
������������Ա�����������ǵ������Ϣ 
����ɵ��û��������룬�����ȷ������Ȩ�޸���
�Ӽ����ϻ�ȡ�µ����룬���и���*/
	String name;
	String password;
	
	public void show(){
		System.out.println("������"+name+",���룺"+password);
	}
	
	public void login(){
		Scanner input = new Scanner(System.in);
		if((name.equals("admin1")&&password.equals("111111"))||(name.equals("admin2")&&password.equals("222222"))){
			System.out.println();
			System.out.print("������������");
			password = input.next();
			System.out.print("�޸�����ɹ�������������Ϊ"+password);
		}
		else{
			System.out.println("�û��������벻ƥ�䣡��û��Ȩ�޸��¹���Ա��Ϣ��");
		}
	
	}

}
