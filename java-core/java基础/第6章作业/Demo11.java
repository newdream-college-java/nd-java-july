/*�û���¼��֤����֤�������3��*/
import java.util.*;
public class Demo11{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		for(int i=1;i<=3;i++){
			System.out.print("�������û�����");
			String name=input.next();
			System.out.print("���������룺");
			String psw=input.next();
			if(psw.equals("123456")){
				System.out.println("��ӭ��¼MyShoppingϵͳ��");
				break;
			}else{
				System.out.println("�������������"+(3-i)+"�λ��ᣡ");
				if((3-i)==0){
					System.out.println("\n�Բ�����3�ξ��������");
				}
			}
		}
	}
}