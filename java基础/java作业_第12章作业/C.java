import java.util.Scanner;


public class C {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		A p = new A();
		
		p.show();
		
		System.out.println();
		System.out.print("������Ҫ�޸ĵĿͻ�������");
		String a = input.next();
		p.xg(a);
		p.cx();
	}
}
