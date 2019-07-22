package Jul22;

/*1.4、使用面向对象的思想编写一个计算器类(Calculator),可以实现两个整数的加、
 减、乘、除 运算。
 */
public class Calculator {
	double num1;
	double num2;
	double num;
	public double calculator(int n) {
		switch (n) {
		case 1:
			num = num1+num2;
			break;
		case 2:
			num = num1-num2;
			break;
		case 3:
			num = num1*num2;
			break;
		case 4:
			num = num1/num2;
		default:
			break;

		}
		return num;
	}
}
