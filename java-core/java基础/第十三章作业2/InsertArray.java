package 第十三章作业2;

import java.util.Scanner;

/*1.3、 编写程序，向整型数组的指定位置插入元素，输出插入前后数组的值
提示:方法 insertArray()定义如下:
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
		System.out.println("原数组的值为：");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+"\t");
		}
		System.out.println();
		System.out.print("请输入你要插入的下标：");
		int index=input.nextInt();
		System.out.print("请输入你要插入的值：");
		int value=input.nextInt();
		InsertArray is=new InsertArray();
		is.insertArray(num, index, value);
	}

}
	