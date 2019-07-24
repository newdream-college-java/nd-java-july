/*2、 编写一个方法求 n!(n 的阶乘)，用递归方法实现 提示:递归方法指直接或间接
地调用自身的方法，n 的阶乘递归可表示*/
package demo09;

public class Factorial {
	public int jiechen(int n){
		if(n<=1){
			return 1;
		}
		return n*jiechen(n-1);
	}
}
