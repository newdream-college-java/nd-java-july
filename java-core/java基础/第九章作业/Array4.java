/*1.4、需求说明
向上一个练习中得到的升序字符序列中插入一个新的字符，要求插入之后字符序列
仍保 持有序 修改上一个题目的代码，定义长度为 9 的数组，保存原字符序列 按上
一题方法实现字符序列排序找到新增字符的插入位置 从插入位置开始的元素均后
移一个位置 插入新的字符，并输出结果*/

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		char[] c={'\0','a','c','u','b','e','p','f','z'};
		System.out.print("原字符序列：");
		for(int i=1;i<c.length;i++){
			System.out.print(c[i]+" ");
		}
		System.out.println();
		Arrays.sort(c);
		System.out.print("升序排序后：");
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+" ");			
		}
		System.out.println();
		System.out.print("请输入一个字符：");
		char n=input.next().charAt(0);
		//1.找位置
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

		//2.移动位置
		for(int i=0;i<index;i++){
			c[i]=c[i+1];
		}
		c[index]=n;	
		System.out.print("插入后的序列：");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println();
		System.out.println("下标为："+index);
	}
}
