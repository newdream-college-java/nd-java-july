/*������һ�����б��չ����������롣���õ������Ǯ����������������붼Ҫ��ȷ�� 
�����һ�����붼����ȷ����ֱ�Ӱ����������棻�����һ������������ȷ��������Ȩ����� �������롣
ֻ�е��ڶ�������Ҳ������ȷ�������õ�Ǯ��(���������Լ��裬Ҫ�����볤�Ȳ� �ܵ��� 6 λ) 
	�������һ������; 
	if(��һ��������ȷ){ 
	������� 2 ������; 
	if(�� 2 ��������ȷ){ 
	��ϲ�õ�Ǯ�� 
	}else{ 
	�� 2 ��������� 
	} 
	}else{ 
	�� 1 ��������� 
	} 
	 */
import java.util.Scanner;

public class C{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("�������һ�����룺");
		int x=input.nextInt();
		if(x==1234567){
			System.out.print("������ڶ������룺");
			int y=input.nextInt();
			if(y==7654321){
			System.out.println("��ϲ�õ�Ǯ��");
			}else{
			System.out.println("�ڶ����������");
			}
		}else{
		System.out.println("��һ���������");
		}
	}
}