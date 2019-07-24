package chapter_13_2;
/*1.4、写一个数学家的类，类中有带参数的方法如下: 
a)传入一个整形的数组，返回这个整形数组中的所有数据之和的方法。
b)传入一个整形的数组，返回这个整形数组中的最大值的方法*/
public class Mather {
	public int sum(int [] a){
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	public int max(int [] b){
		int max=b[1];
		for (int i = 1; i < b.length; i++) {
			if(max<b[i]){
				max=b[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Mather m=new Mather();
		int[] arr={1,3,5,7,9,6,8};
		System.out.println("数组的和为："+m.sum(arr));
		System.out.println("数组的最大值是："+m.max(arr));
	}

}
