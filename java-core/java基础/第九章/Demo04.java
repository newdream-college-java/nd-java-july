/*
向上一个练习中得到的升序字符序列中插入一个新的字符，要求插入之后字符序列
仍保 持有序 修改上一个题目的代码，定义长度为 9 的数组，保存原字符序列 按上
一题方法实现字符序列排序找到新增字符的插入位置 从插入位置开始的元素均后
移一个位置 插入新的字符，并输出结果
*/
import java.util.*;
public class Demo04{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//输出原字符
		char[] arr = {0,'a','c','u','b','e','p','f','z'};
		System.out.print("原字符序列：");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//输出排序后的字符
		System.out.print("升序后的字符序列：");
		Arrays.sort(arr);
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//输入要排序的字符
		System.out.print("请输入一个字符：");
		char a = input.next().charAt(0);
		System.out.println();
		//排序
		int index = 0;//插入数字的下标
		boolean flag = false;//假设找不到比输入的数大的数
		for(int i = 1;i<arr.length;i++){
			if(a<arr[i]){
				flag = true;
				index = i-1;
				break;
			}
		}
		if(!flag){
			index = arr.length-1;
		}
		//将比输入数小的数的下标前移
		for(int i =0;i<index;i++){
			arr[i] = arr[i+1];
		}
		arr[index] = a;
		System.out.print("插入字符后的序列：");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("插入的下标是："+index);
		
		
	}
}