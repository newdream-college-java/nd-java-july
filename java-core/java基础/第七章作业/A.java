/*	
	���ʵ�ֽ����û����������������������Ľ׳ˡ�
	���磺�������� 4������� 4!=4*3*2*1=24��
	Ҫ���������� 1~10��������ʾ����
*/
import java.util.Scanner;

public class A{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sum=1;
		System.out.print("������һ����������");
		int a=input.nextInt();
		if(a>=1&&a<=10){
		System.out.print(a+"!=");
		//ʹ��ѭ������a���˵ݼ�
		for(;a>=1;a--){
			sum=sum*a;
			System.out.print(a);
			//�ж�*��=��λ��
			if(a!=1){
				System.out.print("*");
			}else{
				System.out.print("=");
			}
		}
		System.out.println(sum);
		}else{
			System.out.println("������󣡣���");
		}
	}
}
	

	
