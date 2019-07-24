package chapter13;

/*
 	写一个数学家的类，类中有带参数的方法如下:
	a)传入一个整形的数组，返回这个整形数组中的所有数据之和的方法。
	b)传入一个整形的数组，返回这个整形数组中的最大值的方法
*/

public class Mathematician {
	public int add(int[] a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	
	public int max(int[] a) {
		int max=a[0];
		for (int i = 1; i < a.length; i++) {
			if(max<a[i]){
				max=a[i];
			}
		}
		return max;
	}
}
