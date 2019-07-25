package demo03;

import java.util.Scanner;

public class InsertArrayTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		InsertArray array=new InsertArray();
		int []arr={0,1,2,3,4,5};
		System.out.println("原数组：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		System.out.print("请输入要插入的数：");
		int value=input.nextInt();
		System.out.print("请输入要插入位置的下标：");
		int index=input.nextInt();
		array.insertArray(arr, index, value);
		System.out.println("插入后的数组：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
}
