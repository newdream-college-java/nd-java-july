/*1.5、循环要求用户输入一个 0 到 2 之间的整数，
如果输入的是 0 就输出“你出的是石头”，
如果输入的是 1 就输出“你出的是剪刀”，
如果输入的是 2 就输出“你出的是布”，
如果是其它数就结束程序。*/
import java.util.*;
public class E{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个0到2的整数：");
		int a=input.nextInt();
		while(a>=0&&a<=2){
			switch(a){
				case 0:
					System.out.println("你出的是石头！");
					break;
				case 1:
					System.out.println("你出的是剪刀！");
					break;
				case 2:
					System.out.println("你出的是布！");
					break;
				
			}
			a=input.nextInt();
		}
		System.exit(-1);
	}
}