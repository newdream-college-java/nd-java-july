/*2.3���û���¼��֤����֤������� 3 ��*/
import java.util.*;
public class K{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("MyShopping����ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ\n");
		String name="lili",password="123456";
		int i=1;
		for(;i<=3;i++){
			System.out.print("�������û�����");
			String s1=input.next();
			System.out.print("���������룺");
			String s2=input.next();
			if(s1.equals(name)&&s2.equals(password)){
				System.out.print("��ӭ��½MyShoppingϵͳ������");
				break;
			}else{
				System.out.print("�������������"+(3-i)+"�λ��ᣡ\n");
			}
		}
		if(i==4){
			System.out.print("�Բ����������������");
		}
	}
}