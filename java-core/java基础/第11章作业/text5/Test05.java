package proJob11.text5;
//�ô���ʵ�ּ�����(Calculator)
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		// TODO Auto-generated method stub
		Calculator cal=new Calculator();
		System.out.print("�������һ������");
		cal.num1=input.nextDouble();
		System.out.print("������ڶ�������");
		cal.num2=input.nextDouble();
		System.out.print("�������������+��-��*��/����");
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
			System.out.println("Ŀǰ����֧���������㣡");
			break;
		}
	}

}
