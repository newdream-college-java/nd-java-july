/*1.3、需求说明
将一组乱序的字符进行升序排序 创建数组存储原字符序列
利用 Array 类的 sort( )方法对数组进行排序，并循环输出 从最后一个元素开始，
将数组中的元素逆序输出*/

import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c={'a','c','u','b','e','p','f','z'};
		System.out.print("原字符序列：");
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+" ");
		}
		System.out.println();
		Arrays.sort(c);
		System.out.print("升序排序后：");
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+" ");			
		}
		System.out.println();
		System.out.print("降序排序后：");
		for(int i=c.length-1;i>=0;i--){
			System.out.print(c[i]+" ");
		}
	}

}
