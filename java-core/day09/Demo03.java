import java.util.Arrays;
import java.util.Scanner;

/**
 * 将一组乱序的字符进行升序排序 创建数组存储原字符序列 利用 Array 类的 sort( )方法对数组进行排序，并循环输出 从最后一个元素开始，
 * 将数组中的元素逆序输出
 */
public class Demo03 {
	public static void main(String[] args) {
		char[] arr = { 'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z' };
		System.out.print("字符原序列:");
		// 引用方法遍历
		getTraverse(arr);
		// 对字符进行升序排序
		Arrays.sort(arr);
		System.out.print("字符升序排序后:");
		getTraverse(arr);
		// 将数组中的元素逆序输出
		System.out.print("逆序输出为:");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		System.out.println();
		/*
		 * 向上一个练习中得到的升序字符序列中插入一个新的字符，要求插入之后字符序列 仍保 持有序 修改上一个题目的代码，定义长度为 9
		 * 的数组，保存原字符序列 按上 一题方法实现字符序列排序找到新增字符的插入位置 从插入位置开始的元素均后 移一个位置
		 * 插入新的字符，并输出结果
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个字符:");
		// 应为输入没有char型所以用字符串代替
		String Data = input.next();
		// 转换为字符型
		char chardata = Data.charAt(0);
		getCharInsert(arr, chardata);

	}

	// 遍历的方法
	public static void getTraverse(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	// 字符插入方法
	public static void getCharInsert(char[] arr, char chardata) {
		int index = 0;
		for (; index < arr.length; index++) {
			if (chardata < arr[index]) {
				System.out.println("插入的下标是:" + index);
				break;
			}
		}
		for (int i = arr.length - 1; i > index; i--) {
			arr[i] = arr[i - 1];
		}
		arr[index] = chardata;
		System.out.print("插入后的字符序列是:" + Arrays.toString(arr));
	}
}
