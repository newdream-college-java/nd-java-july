import java.awt.im.InputContext;
import java.util.Arrays;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;
/*
 向上一个练习中得到的升序字符序列中插入一个新的字符，要求插入之后字符序列
仍保 持有序 修改上一个题目的代码，定义长度为 9 的数组，保存原字符序列 按上
一题方法实现字符序列排序找到新增字符的插入位置 从插入位置开始的元素均后
移一个位置 插入新的字符，并输出结果 
 */

public class Demo04 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入数组长度：");
		int n=input.nextInt();
		char arr[]=new char[n+1];
		shuRu(arr);
		System.out.print("原字符序列：");
		shuChu(arr);
		sorts(arr);
		System.out.print("请输入一个字符：");
		char zf=input.next().charAt(0);
		System.out.println("\n");
		cha(arr, zf);
	}
	
	public static void shuRu(char arr[]){
		arr[0]=' ';
		for(int i=1;i<arr.length;i++){
			Scanner input=new Scanner(System.in);
			System.out.print("请输入第"+i+"个字符：");
			arr[i]=input.next().charAt(0);
		}
	}
	
	public static void shuChu(char arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
	
	public static void sorts(char arr[]){
		Arrays.sort(arr);
		System.out.println();
		System.out.print("升序后字符序列：");
		shuChu(arr);
		System.out.println();
	}
	
	public static void cha(char arr[],char zf){
		int index=0;
		boolean flag=false;
		for(int i=1;i<arr.length;i++){
			if(zf<=arr[i]){
				index=i-1;
				flag=true;
				break;
			}
		}
		if(!flag){
			index=arr.length-1;
		}
		for(int i=0;i<index;i++){
			arr[i]=arr[i+1];
		}
		arr[index]=zf;
		System.out.println();
		System.out.print("插入字符后的字符序列：");
		shuChu(arr);
		System.out.println();
		System.out.print("插入的位置："+index);
	}
}
