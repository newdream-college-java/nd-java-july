package work;

/**
 * 1.6、写一个数学家的类，类中有带参数的方法如下: 
 * a)传入两个整数，进行比较，返回两个数中的最大值的方法。
 * b)传入一个整数，返回这个整数的个位数是几的方法。 
 * c)传入一个整数，返回这个整数的立方的方法。 
 * d)传入一个正整数，计算从 1
 * 加到此整数的和是多少的方法。比如输入一个 5 那么就计算 1+2+3+4+5=15，最后返回 15。
 * 
 * */
public class MathMan {
	public int max(int a,int b) {
		return a>b?a:b;
	}
	public int number1(int a) {
		return a%10;
	}
	public int number2(int a) {
		return a*a*a;
	}
	public int number3(int a) {
		int sum = 0;
		for(int i =1;i<=a;i++){
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		MathMan math = new MathMan();
		System.out.println(math.max(1, 9));
		System.out.println(math.number1(123));
		System.out.println(math.number2(4));
		System.out.println(math.number3(5));
	}
}
