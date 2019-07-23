import java.util.Scanner;
public class CalulatDemo {
	//测试计算器
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("请输入第一个数:");
		Calculator calculator=new Calculator();
		calculator.one=input.nextInt();
		System.out.print("请输入第二个数:");
		calculator.two=input.nextInt();
		System.out.println("请输入要做的运算(+-*/)");
		String data=input.next();
		if(data.equals("+")){
			calculator.jia(calculator.one, calculator.two);
		}else if(data.equals("-")){
			calculator.jian(calculator.one, calculator.two);
		}else if(data.equals("*")){
			calculator.Cheng(calculator.one, calculator.two);
		}else if(data.equals("/")){
			calculator.chu(calculator.one, calculator.two);
		}else{
			System.out.println("输入有误");
		}
	}
}
