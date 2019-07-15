/*
1.5、循环要求用户输入一个 0 到 2 之间的整数， 
如果输入的是 0 就输出“你出的是石头”， 
如果输入的是 1 就输出“你出的是剪刀”， 
如果输入的是 2 就输出“你出的是布”， 
如果是其它数就结束程序。
*/
import java.util.*;
public class Demo05 {
	public static void main(String[] args){
		System.out.print("请输入一个0-2的整数：");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		while(a>=0&&a<3){
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
				break;
			}
			System.out.print("请输入一个0-2的整数：");
			input = new Scanner(System.in);
			a = input.nextInt();
		}
		System.out.print("输入错误");		
	}
}