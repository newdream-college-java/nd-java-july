/*1.3������˵��
��һ��������ַ������������� ��������洢ԭ�ַ�����
���� Array ��� sort( )����������������򣬲�ѭ����� �����һ��Ԫ�ؿ�ʼ��
�������е�Ԫ���������*/

import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c={'a','c','u','b','e','p','f','z'};
		System.out.print("ԭ�ַ����У�");
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+" ");
		}
		System.out.println();
		Arrays.sort(c);
		System.out.print("���������");
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+" ");			
		}
		System.out.println();
		System.out.print("���������");
		for(int i=c.length-1;i>=0;i--){
			System.out.print(c[i]+" ");
		}
	}

}
