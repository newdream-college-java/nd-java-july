/*
1.5、输入一个整数 n，如果 n 大于 0， 
则求和:1+1/2+1/3+...+1/n，否则输出：输入错误 
*/
import java.util.*;
public class Demo05{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		System.out.print("请输入一个整数：");
		double sum=0;
		if(input.hasNextInt()){
			int n =input.nextInt();
			if(n>0){
				for(int i =1;i<=n;i++){
					sum+=1.0/i;
				}
				System.out.print("和为:"+sum);
			}else{
				System.out.print("输入错误");
			}
		}else{
			System.out.print("输入不合法");
		}
	}
}