/*
1.3、需求说明
将一组乱序的字符进行升序排序 创建数组存储原字符序列
利用 Array 类的 sort( )方法对数组进行排序，并循环输出 从最后一个元素开始，
将数组中的元素逆序输出
*/
import java.util.*;
public class Demo03{
	public static void main(String[] args){
		char[] arr = {'g','e','a','f','s','y','m','z'};
		System.out.print("原字符序列：");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		Arrays.sort(arr);
		System.out.print("升序排序后：");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("逆序输出为：");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[arr.length-i-1]+" ");
		}
	}
}