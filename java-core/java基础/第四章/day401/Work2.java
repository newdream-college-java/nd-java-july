/*2.1、猴子去买桃，如果买 3 个以下，老板就不送桃，如果买 3 个到 5 个就再送一个 桃，如果买 5 个以上就送 2 个桃，现在要求输入猴子的买桃数，最后输出到底买到 了几个桃。*/
import java.util.Scanner;
public class Work2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入桃子数：");
		int x = sc.nextInt();
		if(x<=3){
			System.out.println("您买的桃子数为："+x);
		}else if(x<=5){
			System.out.println("您买的桃子数为："+(x+1));
		}else
			System.out.println("您买到的桃子数为："+(x+2));
	}
}