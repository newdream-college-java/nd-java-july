package demo03;

import java.util.Scanner;

public class InsertArrayTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		InsertArray array=new InsertArray();
		int []arr={0,1,2,3,4,5};
		System.out.println("ԭ���飺");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		System.out.print("������Ҫ���������");
		int value=input.nextInt();
		System.out.print("������Ҫ����λ�õ��±꣺");
		int index=input.nextInt();
		array.insertArray(arr, index, value);
		System.out.println("���������飺");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
}
