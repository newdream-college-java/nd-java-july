package chapter13;

import java.util.Scanner;

/*
	 编写程序，向整型数组的指定位置插入元素，输出插入前后数组的值
*/

public class Insertarray {

	public static void main(String[] args) {
		int[] arr={1,2,3,4,0};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("请输入你要插入的下标：");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		if (a>arr.length) {
			System.out.println("下标超出范围!!程序退出！！！");
			return;
		}
		System.out.print("请输入你要插入的值：");
		int b=input.nextInt();
		Insertarray insertarray=new Insertarray();
		insertarray.insertArray(arr, a, b);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public void insertArray(int [] arr,int index,int value){ 
		for (int i = arr.length-1; i >index; i--) {
			arr[i]=arr[i-1];
		}
		arr[index]=value;
	}
	
}
