/*2.1、猴子去买桃，如果买 3 个以下，老板就不送桃，如果买 3 个到 5 个就再送一个 桃，如果买 5 个以上就送 2 个桃，现在要求输入猴子的买桃数，最后输出到底买到 了几个桃。*/
import java.util.Scanner;
public class Monkey{
	public static void main(String[] args){
		int total=0;
		Scanner input=new Scanner(System.in);
		System.out.print("请输入猴子买桃数：");
		int num=input.nextInt();
		if(num>0&&num<3){
			total=num;
		}else if(num>=3&&num<=5){
			total=num+1;
		}else if(num>5){
			total=num+2;
		}
		System.out.print("猴子最终得到桃数："+total);
	}
}