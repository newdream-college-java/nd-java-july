import java.util.Scanner;
public class A1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������������:");
		int a = input.nextInt();
		switch(a){
			case 1:
			case 2:
				System.out.print("����"+a+"������");
				break;
			case 3:
			case 4:
			case 5:
				System.out.print("����"+(a+1)+"������");
				break;
			default:			
				System.out.print("����"+(a+2)+"������");
		}
	}
}