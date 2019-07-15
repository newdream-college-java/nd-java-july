/*如何处理输入的异常？*/
import java.util.Scanner;
public class Demo04{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//提示
		System.out.println("请输入一个整数：");
		int a = -1;
		if(input.hasNextInt()){//input.hasNextInt() 输入的是整数 就返回true 否则返回false
			a= input.nextInt();
		}else{
			System.out.println("亲，你看清楚，是输入整数！！！程序退出！请重新启动程序");
			//如何处理？1.重新输入   2.退出程序。
			System.exit(-1);//终止程序
		}

		

		System.out.println("a=="+a);
	}
}