/*1.3��һ��������ַ������������� ��������洢ԭ�ַ��������� Array ��� sort( )����������������򣬲�ѭ����� �����һ��Ԫ�ؿ�ʼ���������е�Ԫ���������*/
import java.util.Arrays;
public class Work03{
	public static void main(String [] args){
		char[] c={'a','c','u','b','e','p','f','z'};
		System.out.print("ԭ�ַ����У�");
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+"\t");
		}
		System.out.println();
		Arrays.sort(c);
		System.out.print("���������");
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+"\t");
		}
		System.out.println();
		System.out.print("�������Ϊ��");
		for(int i=c.length-1;i>=0;i--){
			System.out.print(c[i]+"\t");
		}
		
	}
}