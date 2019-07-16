import java.util.Scanner;
public class E{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请出拳：(0：石头；1：剪刀; 2：布)");
		int a = input.nextInt();
		switch(a){
		case 0:
			System.out.println("你出的是石头");
			break;
		case 1:
			System.out.println("你出的是剪刀");
			break;
		case 2:
			System.out.println("你出的是布");
			break;
		default:
			System.exit(-1);
		}
		
}
}