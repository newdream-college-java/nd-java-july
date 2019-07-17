/*输入一个整数 n,统计 1 到 n 中有多少个奇数和偶数*/
import java.util.*;
public class Demo06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int n=input.nextInt();
		int count=0;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				count++;
			}
		}
		System.out.println("从1到"+n+"一共有"+count+"个整数"+(n-count)+"个奇数");
	}
}