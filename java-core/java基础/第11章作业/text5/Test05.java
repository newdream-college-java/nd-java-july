package proJob11.text5;
//用代码实现计算器(Calculator)
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		// TODO Auto-generated method stub
		Calculator cal=new Calculator();
		System.out.print("请输入第一个数：");
		cal.num1=input.nextDouble();
		System.out.print("请输入第二个数：");
		cal.num2=input.nextDouble();
		System.out.print("请输入运算符（+，-，*，/）：");
		char a=input.next().charAt(0);
		switch (a) {
		case '+':
			System.out.println(cal.num1+"+"+cal.num2+"="+cal.add());
			break;
		case '-':
			System.out.println(cal.num1+"-"+cal.num2+"="+cal.minus());
			break;
		case '*':
			System.out.println(cal.num1+"*"+cal.num2+"="+cal.multiple());
			break;
		case '/':
			System.out.println(cal.num1+"/"+cal.num2+"="+cal.divide());
			break;
		default:
			System.out.println("目前还不支持这种运算！");
			break;
		}
	}

}
