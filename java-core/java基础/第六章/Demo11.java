/*
2.3���û���¼��֤����֤������� 3 ��
*/
import java.util.*;
public class Demo11{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("�����û�����");
		String name1 = input.next();
		System.out.print("�������룺");
		int a = input.nextInt();
		for(int i =1;i<=3;i++){
			System.out.print("�������û�����");
			String name2 = input.next();
			if(name2.equals(name1)){
				System.out.print("���������룺");
				int b = input.nextInt();
				if(a==b){
					System.out.print("��ӭ��¼MyShoppingϵͳ");
					break;
				}
				else{
					System.out.println("�������,�㻹��"+(3-i)+"�λ���");
				}	
			}
			else{
				System.out.println("�û�������,�㻹��"+(3-i)+"�λ���");
			}
			if(i==3){
				System.out.print("�Բ�����3���������");
			}
		}
	}
}