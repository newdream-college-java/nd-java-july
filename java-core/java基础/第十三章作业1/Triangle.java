package ��ʮ������ҵ1;

import java.util.Scanner;

/*
 1.5������ָ����ͬ���к��ַ������ɲ�ͬ��������
 */
public class Triangle {

	public void printTriangle(int row,String ch) {
		for (int i = 1; i <= row; i++) {
			for (int j = i; j >=1; j--) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("�������иߣ�");
		int row=input.nextInt();
		System.out.print("��ӡ���ַ���");
		String ch=input.next();
		Triangle triangle=new Triangle();
		triangle.printTriangle(row, ch);
	}

}
