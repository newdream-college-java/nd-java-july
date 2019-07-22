import java.util.Scanner;


public class D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D j = new D();
		System.out.println("计算结果为："+j.Calculator());
	}
	public double Calculator(){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		double a = input.nextDouble();
		System.out.println("请输入运算符：");
		String b = input.next();
		System.out.println("请输入第二个整数：");
		double c = input.nextDouble();
		double d=0;
		if(b.equals("+")){
			d=a+c;
		}else if(b.equals("-")){
			d=a-c;
		}else if(b.equals("*")){
			d=a*c;
		}else if(b.equals("/")){
			d=a/c;
		}
		return d;
	}

}
