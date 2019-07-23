import java.util.Scanner;


public class Calculator {
	public double add(double num1,double num2){
		return num1+num2;
	}
	public double minus(double num1,double num2){
		return num1-num2;
	}
	public double multiple(double num1,double num2){
		return num1*num2;
	}
	public double divide(double num1,double num2){
		if(num2==0){
			System.out.print("除数不能为0");
		}
		return num1/num2;
	}
	public static void main(String[] args) {
		Calculator c=new Calculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个数字");
		double a=sc.nextDouble();
		System.out.println("请输入第二个数字");
		double b=sc.nextDouble();
		System.out.println("输入1选择加法，2为减法，3为乘法，4为除法");
		int num=sc.nextInt();
		switch(num){
		case 1:
			System.out.println(c.add(a,b));
			break;
		case 2:
			System.out.println(c.minus(a,b));
			break;
		case 3:
			System.out.println(c.multiple(a,b));
			break;
		case 4:
			System.out.println(c.divide(a,b));
			break;
		}
	}
}
