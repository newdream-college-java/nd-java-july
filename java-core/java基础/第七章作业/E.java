/*	
	输入一个整数 n，如果 n 大于 0，
	则求和:1+1/2+1/3+...+1/n，
	否则输出：输入错误
*/
import java.util.Scanner;

public class E{
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		double sum=0;
		//判断a的范围
		if(a>0){
			//对a递减，在将1/a叠加到sum中
			for(int i=a;i>0;i--)  
			sum=sum+1.0/i;   
		}else{
			System.out.println("输入错误！！！");
		}
		System.out.println("总和为："+sum);
	}
}