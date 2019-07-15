/*
1.5、循环要求用户输入一个 0 到 2 之间的整数，
如果输入的是 0 就输出“你出的是石头”，
如果输入的是 1 就输出“你出的是剪刀”，
如果输入的是 2 就输出“你出的是布”，
如果是其它数就结束程序。
*/
import java.util.Scanner;
public class Demo05{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个数：");
		int a = sc.nextInt();
		while(a == 0||a  == 1||a ==2){
			switch(a){
				case 0:
					System.out.println("你出的是石头！！！");
					System.out.print("请输入一个数：");
					a = sc.nextInt();
					break;
				case 1:
					System.out.println("你出的是剪刀！！！");
					System.out.print("请输入一个数：");
					a = sc.nextInt();
					break;
				case 2:
					System.out.println("你出的是布！！！");
					System.out.print("请输入一个数：");
					a = sc.nextInt();
					break;
				default:
					break;
 
			}
		}
		System.out.println("您的输入有误，程序退出！！！");
	}	
}
                                  