/*2.3���û���¼��֤����֤������� 3 ��*/
import java.util.Scanner;
public class Work11{
	public static void main(String[] args ){
		Scanner sc=new Scanner(System.in);
		int i=1;
		for(;i<=3;i++){
			System.out.print("�������û�����");
			String userName=sc.next();
			System.out.print("���������룺");
			int passWord=sc.nextInt();
			if(userName.equals("clc")&&passWord==666666){
				System.out.println("��ӭ��¼MyShoppingϵͳ��");
				break;
			}else {
				System.out.println("�������!������"+(3-i)+"�λ��ᣡ");				
				
			}
			
		}
		if(i==4){
			System.out.println("�Բ�����3����������󣡣�");	
		}
	}
}