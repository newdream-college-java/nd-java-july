package Chapter09_array;

/*
 向上一个练习中得到的升序字符序列中插入一个新的字符，要求插入之后字符序列
 仍保 持有序 修改上一个题目的代码，定义长度为 9 的数组，保存原字符序列 按上
 一题方法实现字符序列排序找到新增字符的插入位置 从插入位置开始的元素均后
 移一个位置 插入新的字符，并输出结果
 */

import java.util.*;

public class D {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[] zm = { ' ', 'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z' };
		System.out.print("原字符序列：");
		for (int i = 1; i < zm.length; i++) {
			System.out.print(zm[i] + " ");
		}
		System.out.println();
		System.out.print("升序后字符序列：");
		Arrays.sort(zm);
		for (int i = 0; i < zm.length; i++) {
			System.out.print(zm[i] + " ");
		}
		System.out.println();
		System.out.print("请输入一个字符：");
		char c = input.next().charAt(0);
		int index = 0;
		// 找到c在数组中所在的位置
		for (int i = 1; i < zm.length; i++) {
			if (c < zm[i]) {
				index = i - 1;
				break;
			}
		}
		if (c >= zm[zm.length - 1]) {
			index = zm.length - 1;
		}
		System.out.println();
		// 将c位置前面的所有数往前移一位
		for (int i = 0; i < index; i++) {
			zm[i] = zm[i + 1];
		}
		// 将c放到index位置中
		zm[index] = c;
		for (int i = 0; i < zm.length; i++) {
			System.out.print(zm[i] + " ");
		}
		System.out.println();
		System.out.println("插入的位置是：" + index);
	}

}
