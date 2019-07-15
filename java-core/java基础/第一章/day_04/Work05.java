/*1.5、循环要求用户输入一个 0 到 2 之间的整数，如果输入的是 0 就输出“你出的是石头”，如果输入的是 1 就输出“你出的是剪刀”，如果输入的是 2 就输出“你出的是布”，如果是其它数就结束程序。*/
import java.util.*;
public class Work05{
	public static void main(String [] agrs){
		Scanner sc=new Scanner(System.in);
		//Random rd=new Random();
		System.out.print("請輸入一個整數（0-2）：");
		int a =sc.nextInt();
		//int b=rd.nextInt(2);
		while(true){
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

				default :
				System.out.println("输入错误，程序退出");
				System.exit(-1);
		
			}
			System.out.print("請輸入一個整數（0-2）：");
			a =sc.nextInt();
		}
	}
	
}