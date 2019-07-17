/*2.1、猴子去买桃，如果买 3 个以下，老板就不送桃，如果买 3 个到 5 个就再送一个 桃，如果买 5 个以上就送 2 个桃，现在要求输入猴子的买桃数，最后输出到底买到 了几个桃。*/
import java.util.Scanner;
public class Work02{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("请输入猴子的买桃数量：");
		int n=in.nextInt();
		if(n>5){
			System.out.println("买到了"+(n+2)+"个桃子");
			
		}else if(n<=5&&n>=3){
			System.out.println("买到了"+(n+1)+"个桃子");
		}else if(n<3){
			System.out.println("买到了"+n+"个桃子");
		}else {
			System.out.println("输入不合法!");
		}
	}

}