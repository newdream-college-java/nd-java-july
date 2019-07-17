/*1.6、输入一个整数 n,统计 1 到 n 中有多少个奇数和偶数*/
import java.util.Scanner;
public class Work6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个正整数：");
		int a = sc.nextInt();
		int count1 = 0;
		int count2 = 0;
		for(int i =1;i<=a;i++){
			if(i%2==0){
				count1++;
			}else
				count2++;
		}
		System.out.println("偶数有"+count1+"个");
		System.out.println("奇数有"+count2+"个");
	}
}