package Chapter11_类的无参方法;

/*
	编写一个方法求 n!(n 的阶乘)，用递归方法实现 提示:递归方法指直接或间接
	地调用自身的方法，n 的阶乘递归可表示
*/
import java.util.*;

public class Recursion {

	
	public static void main(String[] args) {
		Recursion recursion=new Recursion();
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		System.out.println(recursion.jiechen(a));
	}
	
	public int jiechen(int n) {
		if(n<=1){
			return 1;
		}
		return n*jiechen(n-1);
	}

}
