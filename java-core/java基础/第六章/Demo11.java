/*2.3���û���¼��֤����֤������� 3 ��*/
import java.util.Scanner;
public class Demo11{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		int i=3;
		for(;i>=1;i--){
			System.out.print("�������û�����");
			String user=input.next();
			System.out.print("���������룺");
			String passWord=input.next();
			if(user.equals("yuankun")&&passWord.equals("123456")){
				System.out.print("��ӭ��½MyShoppingϵͳ!");
				break;
			}else{
				System.out.println("�������������"+(i-1)+"�λ���!");
				System.out.println("");	
				System.out.println("");
			}
		}
		if(i==0){
			System.out.print("�Բ���,��3�ξ��������!");	
		}
	}
}