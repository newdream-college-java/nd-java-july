import java.util.Scanner;
public class Demo05{
	public static void main(String[] args){
		//2.6、编程实现迷你计算器：支持+、-、*、/，从控制台输入 2 个操作数，输出运算结果。
		Scanner input=new Scanner(System.in);
		System.out.println("请输入第一个数");
		double onedata=input.nextDouble();
		System.out.println("请输入要做的运算+、-、*、/");
		String twodata=input.next();
		System.out.println("请输入第二个数");
		double threedata=input.nextDouble();
		double sum;
		switch (twodata){
			case "+":
			sum=onedata+threedata;
			System.out.println(onedata+"+"+threedata+"="+sum);
			break;
			case "-":
			sum=onedata-threedata;
			System.out.println(onedata+"-"+threedata+"="+sum);
			break;
			case "*":
			sum=onedata*threedata;
			System.out.println(onedata+"*"+threedata+"="+sum);
			break;
			case "/":
			sum=onedata/threedata;
			System.out.println(onedata+"/"+threedata+"="+sum);
			break;
			default:
			System.out.println("只能做+、-、*、/运算");
		}
	}
}