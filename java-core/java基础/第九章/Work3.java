package nine;

import java.util.Arrays;

public class Work3 {

	/**
		1.3��һ��������ַ������������� ��������洢ԭ�ַ�����
		���� Array ��� sort( )����������������򣬲�ѭ
		����� �����һ��Ԫ�ؿ�ʼ���������е�Ԫ���������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ={21,72,43,65,76,43,32,3,13};
		Arrays.sort(a);
		for(int i = a.length-1;i>=0;i--){
			System.out.println(a[i]);
		}	
	}
}
