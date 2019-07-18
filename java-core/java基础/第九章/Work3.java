package nine;

import java.util.Arrays;

public class Work3 {

	/**
		1.3将一组乱序的字符进行升序排序 创建数组存储原字符序列
		利用 Array 类的 sort( )方法对数组进行排序，并循
		环输出 从最后一个元素开始，将数组中的元素逆序输出
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ={21,72,43,65,76,43,32,3,13};
		Arrays.sort(a);
		for(int i = a.length-1;i>=0;i--){
			System.out.println(a[i]);
		}	
	}
}
