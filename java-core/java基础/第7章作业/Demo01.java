/*编程实现接收用户输入的正整数，输出该数的阶乘。*/
import java.util.*;
public class Demo01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sum=1;
		System.out.print("请输入一个整数：");
		int num=input.nextInt();
		if(num>=1&&num<=10){
			for(int i=1;i<=num;i++){
				sum*=i;
			}
			System.out.println(num+"!="+sum);
		}else{
			System.out.println("输入错误，应输入1-10！！!");
		}
	}
}