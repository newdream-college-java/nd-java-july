import java.util.Scanner;


public class D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D j = new D();
		System.out.println("������Ϊ��"+j.Calculator());
	}
	public double Calculator(){
		Scanner input = new Scanner(System.in);
		System.out.println("�������һ��������");
		double a = input.nextDouble();
		System.out.println("�������������");
		String b = input.next();
		System.out.println("������ڶ���������");
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
