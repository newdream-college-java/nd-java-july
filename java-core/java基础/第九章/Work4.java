package nine;

import java.util.Arrays;
import java.util.Scanner;

public class Work4 {

	/**
向上一个练习中得到的升序字符序列中插入一个新的字符，要求插入之后字符序列
仍保 持有序 修改上一个题目的代码，定义长度为 9 的数组，保存原字符序列 按上
一题方法实现字符序列排序找到新增字符的插入位置 从插入位置开始的元素均后
移一个位置 插入新的字符，并输出结果
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a ={'a','d','s','f','w','q','e','r',' '};
		int index = 0;					//设置下标
		boolean flag = false;			//设置标识
		Scanner sc = new Scanner(System.in);
		System.out.print("原字符序列：");
		for(int i = 0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
		System.out.println();

		Arrays.sort(a);	
		System.out.print("升序后的序列：");
		for(int i = 0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		System.out.print("请输入要插入的字符");
		char c = sc.next().charAt(0);
		for(int i = 0;i<a.length;i++){
			if(c<a[i]){					//找到了比c大的，然后确定位置
				index = i-1;
				flag = true;
				System.out.println("要插入的位置"+i);
				break;

			}
		}
		if(!flag){
			System.out.println("没找到！");
		}
		for (int i = 0; i < index; i++) {
			a[i] = a[i+1];
		}
		a[index]=c;
		for(int i = 0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}

	}

}
