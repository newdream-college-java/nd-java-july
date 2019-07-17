/*1.6、输入一个整数 n,统计 1 到 n 中有多少个奇数和偶数*/
import java.util.*;
public class F{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个数：");
		int num=input.nextInt();
		int count1=0,count2=0;
		for(int i=1;i<=num;i++){
			if(i%2==0){
				count1++;
			}else{
				count2++;
			}
		}
		System.out.println("奇数有"+count1+"个\n"+"偶数有"+count2+"个\n");
	}
}