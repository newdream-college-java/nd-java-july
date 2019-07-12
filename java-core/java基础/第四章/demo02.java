/*2.1、猴子去买桃，如果买 3 个以下，老板就不送桃，如果买 3 个到 5 个就再送一个
桃，如果买 5 个以上就送 2 个桃，现在要求输入猴子的买桃数，最后输出到底买到
了几个桃。*/
import java.util.Scanner;
public class demo02{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入猴子的买桃个数");
		int a=input.nextInt();
		if(a<3){
			System.out.println("最后买到的桃子个数为："+a);
		}else if(a<=5){
			System.out.println("最后买到的桃子个数为："+(a+1));
		}else{
			System.out.println("最后买到的桃子个数为："+(a+2));
		}
	}
}