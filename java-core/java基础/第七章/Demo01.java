/*1.1�� ���ʵ�ֽ����û����������������������Ľ׳ˡ����磺�������� 4����
��� 4!=4*3*2*1=24��Ҫ���������� 1~10��������ʾ����*/
import java.util.*;
public class Demo01{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("����һ����������1-10����");
		int a=input.nextInt();
		int b=1;
		if(a>=1&&a<=10){
			System.out.print(a+"!=");
			for(int i=a;i>=1;i--){
				b*=i;
				System.out.print(i+"*");
			}
			System.out.println("="+b);	
		}else{
			System.out.println("������󣡣���");
		}
		
	}
}