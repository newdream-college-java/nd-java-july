import java.util.Scanner;
public class A5{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入0到2之间的整数");
		int i = input.nextInt();	
		while(i<=2 && i>=0){
			switch(i){
				case 0:
					System.out.println("你出的是石头");
					break;
				case 1:
					System.out.println("你出的是剪刀");
					break;
				case 2:
					System.out.println("你出的是布");
					break;
			}
			System.out.print("请输入0到2之间的整数");
			i = input.nextInt();
		}
	}
}