package ��ʮ������ҵ2;

import java.util.Scanner;

/*1.3�� ��д���������������ָ��λ�ò���Ԫ�أ��������ǰ�������ֵ
��ʾ:���� insertArray()��������:
public void insertArray(int [] arr,int index,int value){ }
*/
public class InsertArray {
	
	public void insertArray(int [] arr,int index,int value){
			int temp;
			temp=arr[arr.length-1];
			arr[arr.length-1]=arr[index];
			arr[index]=temp;
			arr[index]=value;	
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+"\t");
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[] num={1,2,3,5,0};
		System.out.println("ԭ�����ֵΪ��");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+"\t");
		}
		System.out.println();
		System.out.print("��������Ҫ������±꣺");
		int index=input.nextInt();
		System.out.print("��������Ҫ�����ֵ��");
		int value=input.nextInt();
		InsertArray is=new InsertArray();
		is.insertArray(num, index, value);
	}

}
	