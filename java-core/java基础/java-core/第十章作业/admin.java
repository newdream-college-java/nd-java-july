/*��д����Ա��(����:�û���������;����:show()��ʾ����Ա��Ϣ) 
������������Ա�����������ǵ������Ϣ*/
package chapter_10;
import java.util.Scanner;
public class admin {
	//��������
	String userName;
	int passWord;
	//���巽��
	public void show(){
		
		System.out.println("������"+userName+",���� ��"+passWord);
	}
	public void gxmima(){
		Scanner input=new Scanner(System.in);
		System.out.print("�������û�����");
		String u=input.next();
		System.out.print("���������룺");
		int m=input.nextInt();
		if(u.equals(userName)&&m==passWord){
			System.out.print("�������µ����룺");
			int newPassword=input.nextInt();
			m=newPassword;
			System.out.println("�޸�����ɹ�������������Ϊ��"+newPassword);
			
		}else{
			System.out.println("�û��������벻��ȷ����û��Ȩ�޸��¹���Ա��Ϣ��");
		}
	}
	public static void main(String[] args) {
		kehu kehu01=new kehu();
		kehu01.cardType="��";
		kehu01.score=3050;
		kehu01.huikui();

	}

}
