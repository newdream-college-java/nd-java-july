/*��д����Ա��(����:�û���������;����:show()��ʾ����Ա��Ϣ) 
������������Ա�����������ǵ������Ϣ
����ɵ��û��������룬�����ȷ������Ȩ�޸���
�Ӽ����ϻ�ȡ�µ����룬���и���
*/
package Demo01;
import java.util.*;
public class Administrator {
	String name;
	String passWord;
	public void show(){
		System.out.println("������"+name+",���룺"+passWord);
	}
	public void gxpassword(){
		Scanner input=new Scanner(System.in);
		System.out.print("�������û���:");
		String name1=input.next();
		System.out.print("����������:");
		String passWord1=input.next();
		System.out.println();
		System.out.println();
		if(name1.equals(name)&&passWord1.equals(passWord)){
			System.out.print("������������:");
			passWord=input.next();
			System.out.println("�޸�����ɹ�������������Ϊ��"+passWord);
		}else{
			System.out.println("�û��������벻ƥ�䣡��û��Ȩ�޸��Ĺ���Ա��Ϣ������");
		}
	}
}
