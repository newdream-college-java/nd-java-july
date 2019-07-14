/*
2.1、猴子去买桃，如果买 3 个以下，老板就不送桃，如果买 3 个到 5 个就再送一个
桃，如果买 5 个以上就送 2 个桃，现在要求输入猴子的买桃数，最后输出到底买到
了几个桃。
*/
import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请问你要买几个桃：");
		int n = input.nextInt();
		if(n<3){
			System.out.println("您最终买了"+n+"个桃子");
		}
		else if(n>=3&&n<=5){
			n = n+1;
			System.out.println("您最终买了"+n+"个桃子");
		}
		else{
			n = n+2;
			System.out.println("您最终买了"+n+"个桃子");
		}
	}
}