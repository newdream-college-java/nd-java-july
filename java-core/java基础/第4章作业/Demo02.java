/*猴子去买桃，如果买 3 个以下，老板就不送桃，如果买 3 个到 5 个就再送一个
桃，如果买 5 个以上就送 2 个桃，现在要求输入猴子的买桃数，最后输出到底买到
了几个桃。*/
import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入要买的桃子数：");
		int a=input.nextInt();
		if(a<3){
			System.out.print("买到的桃子数为："+a);
		}else if(a>=3&&a<5){
			System.out.print("买到的桃子数为："+(a+1));
		}else{
			System.out.print("买到的桃子数为："+(a+2));
		}
	}
}