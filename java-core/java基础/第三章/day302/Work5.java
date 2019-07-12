/*2.4、输入三个整数，如果这三个整数都相等，那么输出“
i这三个数相等”。否则再 判断这三个数之和是否大于 1000，如果大于 1000 输出“这三个数之和大于 1000” 否则输出“这三个数之和不大于 1000”。*/
import java.util.Scanner;
public class Work5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int [] a = new int[3];
		for(int i=0;i<3;i++){
			System.out.print("请输入第  "+ (i+1 )+"  个数：");

			a[i] = sc.nextInt();
		}
		if(a[0]==a[1]&&a[1] ==a[2] ){
			System.out.print("这三个数相等");	
		}else if(a[0]+a[1]+a[2]>1000){
			System.out.print("这三个数之和大于 1000");	
		}else if(a[0]+a[1]+a[2]<1000){
			System.out.print("这三个数之和不大于 1000");	
		}
		
	}
}