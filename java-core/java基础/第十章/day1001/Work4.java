
	/**
	 * 1.4、使用面向对象的思想编写一个计算器类(Calculator),可以实现两个整数的加、
		减、乘、除 运算。
	 */
public class Work4 {
	public void Calculator(int a,char b,int c) {
		int sum = 0;
		switch (b) {
		case '+':
			sum = a+c;
			break;
		case '-':
			sum = a-c;
			break;
		case '*':
			sum = a*c;
			break;
		case '/':
			sum = a/c;
			break;

		default:
			break;
		}
		System.out.println("结果为："+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Work4 a = new Work4();
		a.Calculator(3, '*', 6);
	}

}
