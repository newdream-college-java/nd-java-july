package Work;

/**
 * 1.4、用代码实现计算器(Calculator)
 */
public class Calculator {
	int num1;
	int num2;
	int sum = 0;
	public int add(int num1,int num2) {
		sum = num1+num2;
		return sum;
	}
	public int minus() {
		sum = num1-num2;
		return sum;
	}
	public int mutilpe() {
		sum = num1*num2;
		return sum;
	}
	public double devide() {
		sum = num1/num2;
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(5, 10));
	}

}
