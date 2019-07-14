/*
【练习 2 】 训练要点 使用程序解决现实生活中的问题
2.1、猴子去买桃，如果买 3 个以下，老板就不送桃，如果买 3 个到 5 个就再送一个
桃，如果买 5 个以上就送 2 个桃，现在要求输入猴子的买桃数，最后输出到底买到
了几个桃
*/
import java.util.*;
public class Demo02{
	public static void main (String [] args){
		System.out.println("请输入猴子买桃数：");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if(number>5){
			number=number+2;
		}
		else if(number>2){
			number= number+1;
		}
		System.out.print("总的桃子数："+number);
	}
}