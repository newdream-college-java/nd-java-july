/*
1.3������˵��
��һ��������ַ������������� ��������洢ԭ�ַ�����
���� Array ��� sort( )����������������򣬲�ѭ����� �����һ��Ԫ�ؿ�ʼ��
�������е�Ԫ���������
*/
import java.util.*;
public class Demo03{
	public static void main(String[] args){
		char[] arr = {'g','e','a','f','s','y','m','z'};
		System.out.print("ԭ�ַ����У�");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		Arrays.sort(arr);
		System.out.print("���������");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("�������Ϊ��");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[arr.length-i-1]+" ");
		}
	}
}