/*1.5、循环要求用户输入一个 0 到 2 之间的整数，
如果输入的是 0 就输出“你出的是石头”，
如果输入的是 1 就输出“你出的是剪刀”，
如果输入的是 2 就输出“你出的是布”，
如果是其它数就结束程序。*/
import java.util.Scanner;
public class Demo05{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个 0 到 2 之间的整数:");
		int hd=input.nextInt();
		while((hd==0||hd==1||hd==2)){
			switch(hd){
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
					break;
			}
			System.out.println("请输入一个 0 到 2 之间的整数:");
			hd=input.nextInt();
		}
	}
}