package 第十三章作业2;
/*1.4、写一个数学家的类，类中有带参数的方法如下: 
a)传入一个整形的数组，返回这个整形数组中的所有数据之和的方法。
b)传入一个整形的数组，返回这个整形数组中的最大值的方法*/
import java.util.Scanner;

public class Mathematician {
	public  int  getSum(int[] a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	
	public int getMax(int[] a) {
		int max=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Mathematician m=new Mathematician();
		Scanner input=new Scanner(System.in);
		int[] a=new int[5];
		for (int i = 0; i < a.length; i++) {
			System.out.print("请输入数组中的第"+(i+1)+"个数：");
			a[i]=input.nextInt();
		}
		System.out.println("数组中数据之和为："+m.getSum(a));
		System.out.println("数组中数据最大值为："+m.getMax(a));
	}
}
