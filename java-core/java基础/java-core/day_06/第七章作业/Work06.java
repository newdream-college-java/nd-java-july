/*1.6、输入一个整数 n,统计 1 到 n 中有多少个奇数和偶数*/
import java.util.Scanner;
public class Work06{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int a=sc.nextInt();
		int count_j=0;
		int count_o=0;
		for(int i=1;i<=a;i++){
			if(i%2==0){
				count_o++;
			}else {
				count_j++;
			}
		}
		System.out.println("奇数有"+count_j);
		System.out.println("偶数有"+count_o);
	}
}