/*
1.6、输入一个整数 n,统计 1 到 n 中有多少个奇数和偶数 
*/
import java.util.*;
public class Demo06{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int count1=0,count2=0;
		if(input.hasNextInt()){
			int n =input.nextInt();
			if(n<=0){
				System.out.print("请输入大于1的整数");
			}else{
				for(int i=1;i<=n;i++){
					if(i%2==0){
						count1++;
					}else{
						count2++;
					}
				}
			System.out.print("奇数有"+count2+"个偶数有"+count1+"个");
			}
		}else{
			System.out.print("输入不合法");
		}
		
	}
}
