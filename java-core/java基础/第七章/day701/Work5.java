/*1.5、输入一个整数 n，如果 n 大于 0，
则求和:1+1/2+1/3+...+1/n，否则输出：输入错误*/
import java.util.Scanner;
public class Work5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个正整数：");
		int a = sc.nextInt();
		double sum = 0;
		while(true){
			if(a>0){
				break;
			}
			System.out.print("输入错误，请输入一个正整数：");
			a = sc.nextInt();
		}
		for(int i =1;i<=a;i++){
			sum = sum+1.0/i;
		}
		System.out.println("和为："+sum);
	}
}