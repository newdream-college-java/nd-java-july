import java.util.Scanner;
public class CalulatDemo {
	//���Լ�����
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("�������һ����:");
		Calculator calculator=new Calculator();
		calculator.one=input.nextInt();
		System.out.print("������ڶ�����:");
		calculator.two=input.nextInt();
		System.out.println("������Ҫ��������(+-*/)");
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
			System.out.println("��������");
		}
	}
}
