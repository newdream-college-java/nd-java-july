/*
1.3������˵��		
��һ��������ַ������������� ��������洢ԭ�ַ�����  
���� Array ��� sort( )����������������򣬲�ѭ����� �����һ��Ԫ�ؿ�ʼ��
�������е�Ԫ��������� 
*/
import java.util.*;
public class Demo03{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("���������鳤��:");
		int l= input.nextInt();
		char [] a =new char[l];
		for(int i =0;i<l;i++){
			System.out.print("�������"+(i+1)+"���ַ�Ϊ��");
			a[i]=input.next().charAt(0);
		}
		System.out.print("ԭ�ַ����У�");
		for(int i =0;i<l;i++){
			System.out.print(a[i]+" ");
		}
		Arrays.sort(a);
		System.out.print("\n���������");
		for(int i =0;i<l;i++){
			System.out.print(a[i]+" ");
		}
		System.out.print("\n�������Ϊ��");
		for(int i =(l-1);i>=0;i--){
			System.out.print(a[i]+" ");
		}
	}
}