package text1.praJob10;
/*
 ��д����Ա��(����:�û���������;����:show()��ʾ����Ա��Ϣ) 
������������Ա�����������ǵ������Ϣ.......
 */
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Text01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Adminis adm1=new Adminis();
		Adminis adm2=new Adminis();
		System.out.print("���������Ա1��������");
		adm1.name=input.next();
		System.out.print("���������Ա1�����룺");
		adm1.psw=input.next();
		System.out.print("���������Ա2��������");
		adm2.name=input.next();
		System.out.print("���������Աi�����룺");
		adm2.psw=input.next();
		adm1.show();
		adm2.show();
		
		System.out.print("�������û�����");
		String iname=input.next();
		System.out.print("���������룺");
		String ipsw=input.next();
		if((iname.equals(adm1.name)&&ipsw.equals(adm1.psw))||(iname.equals(adm2.name)&&ipsw.equals(adm2.psw))) {
			System.out.print("�����������룺");
			String newpsw=input.next();
			System.out.print("�޸�����ɹ�������������Ϊ��"+newpsw);
		}else {
			System.out.print("�û��������벻ƥ�䣡��û��Ȩ�޸��¹���Ա��Ϣ��");
		}
		
	}

}
