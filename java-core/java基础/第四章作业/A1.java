import java.util.Scanner;
public class A1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入买桃数:");
		int a = input.nextInt();
		switch(a){
			case 1:
			case 2:
				System.out.print("买到了"+a+"个桃子");
				break;
			case 3:
			case 4:
			case 5:
				System.out.print("买到了"+(a+1)+"个桃子");
				break;
			default:			
				System.out.print("买到了"+(a+2)+"个桃子");
		}
	}
}