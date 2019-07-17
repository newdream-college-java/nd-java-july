/*1.6、输入一个整数 n,统计 1 到 n 中有多少个奇数和偶数*/
import java.util.*;
public class Demo06{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个整数 n：");
		int n=input.nextInt();
		int sum1=0;
		int sum2=0;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				sum1++;
			}else{
				sum2++;
			}
		}
		System.out.println("1到"+n+"有"+sum2+"个奇数");
		System.out.println("1到"+n+"有"+sum1+"个偶数");
	}
}