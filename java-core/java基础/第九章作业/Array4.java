/*1.4������˵��
����һ����ϰ�еõ��������ַ������в���һ���µ��ַ���Ҫ�����֮���ַ�����
�Ա� ������ �޸���һ����Ŀ�Ĵ��룬���峤��Ϊ 9 �����飬����ԭ�ַ����� ����
һ�ⷽ��ʵ���ַ����������ҵ������ַ��Ĳ���λ�� �Ӳ���λ�ÿ�ʼ��Ԫ�ؾ���
��һ��λ�� �����µ��ַ�����������*/

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		char[] c={'\0','a','c','u','b','e','p','f','z'};
		System.out.print("ԭ�ַ����У�");
		for(int i=1;i<c.length;i++){
			System.out.print(c[i]+" ");
		}
		System.out.println();
		Arrays.sort(c);
		System.out.print("���������");
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+" ");			
		}
		System.out.println();
		System.out.print("������һ���ַ���");
		char n=input.next().charAt(0);
		//1.��λ��
		int index=0;
		for(int i=1;i<c.length;i++){
			if(n<c[i]){
				index=i-1;
				break;
			}
			if(n>=c[c.length-1]){
				index=c.length-1;
			}
		}

		//2.�ƶ�λ��
		for(int i=0;i<index;i++){
			c[i]=c[i+1];
		}
		c[index]=n;	
		System.out.print("���������У�");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println();
		System.out.println("�±�Ϊ��"+index);
	}
}
