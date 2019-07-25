import java.util.Arrays;

/**
 * 1.4、写一个数学家的类，类中有带参数的方法如下: 
a)传入一个整形的数组，返回这个整形数组中的所有数据之和的方法。
b)传入一个整形的数组，返回这个整形数组中的最大值的方法
 * @author 54975
 *
 */
public class Math {
	/**
	 * 传入一个整形的数组，返回这个整形数组中的所有数据之和的方法
	 * @param a
	 * @return
	 */
	public int setArray(int[] a){
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	/**
	 * 传入一个整形的数组，返回这个整形数组中的最大值的方法
	 */
	public int setmax(int[] a){
		int max=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max){
				max=a[i];
			}
		}
		return max;
		/*
		 * 第二种方法
		 * Arrays.sort(a);
		return a[a.length-1];*/
	}
	/**
	 * 验证
	 */
	public static void main(String[] args) {
		int[] a={2,2,5,6,1,3,5,6};
		Math m=new Math();
		System.out.println(m.setArray(a));
		System.out.println(	m.setmax(a));
	}
}
