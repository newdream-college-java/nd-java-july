/*��һ��������ַ������������� ��������洢ԭ�ַ�����
���� Array ��� sort( )����������������򣬲�ѭ����� �����һ��Ԫ�ؿ�ʼ��
�������е�Ԫ���������*/
import java.util.*;
public class Demo03{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		char[]a={'a','c','u','b','e','p','f','z'};
		System.out.print("ԭ�ַ����У�");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		Arrays.sort(a);
		System.out.print("���������");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		System.out.print("���������");
		for(int i=a.length-1;i>=0;i--){
			System.out.print(a[i]+" ");
		}
	}	
}