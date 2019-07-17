/*输入一个整数 n，如果 n 大于 0，
则求和:1+1/2+1/3+...+1/n，否则输出：输入错误*/
import java.util.*;
public class Demo05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int n=input.nextInt();
		double sum=0;
		if(n>0){
			for(int i=1;i<=n;i++){
				sum+=1.0/i;
			}
		}else{
			System.out.println("输入错误！");
		}
		System.out.println("结果为："+sum);
	}
}