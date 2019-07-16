/*1.7、循环输入大于 0 的数字进行累加， 直到输入的数字为 0，就结束循环，并最后输出累加的结果。*/
import java.util.Scanner;
public class Work7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true){
			System.out.println("请输入数字：");
			int a = sc.nextInt();
			if(a>0){
				sum+=a;
			}else if(a==0){
				break;
			}else
				System.out.println("输入错误");
			
		}
		System.out.println("你输入的数字和为："+sum);
	}
}