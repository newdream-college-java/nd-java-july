/*������������*/
import java.util.Scanner;
public class Demo03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("�������һ�����룺");
		int a=input.nextInt();
		if(a==123456){
			System.out.print("������ڶ������룺");
			int b=input.nextInt();
			if(b==654321){
				System.out.println("��ϲ�㷢����������");
			
			}else{
				System.out.println("�ڶ���������󣡣���");
			}
		}else{
			System.out.println("��һ��������󣡣���");
		}
		
	}
}