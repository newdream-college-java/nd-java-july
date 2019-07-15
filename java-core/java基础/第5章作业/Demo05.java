/*输入一个0-2的整数，石头0   剪刀1  布 2其他结束*/
import java.util.*;
public class Demo05{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		System.out.print("请输入一个值：");
		int a=input.nextInt();
		while(a>=0&&a<=2){
			switch(a){
				case 0:
				System.out.println("你出的是石头");
				break;
				case 1:
				System.out.println("你出的是剪刀");
				break;
				default:
				System.out.println("你出的是布");
			}
			System.out.print("请输入一个值：");
			a=input.nextInt();
		}
		System.out.println("输入错误，退出程序！！！");
		System.exit(-1);
	}
}