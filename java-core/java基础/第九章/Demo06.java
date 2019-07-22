/*1.6、从键盘上输入 10 个整数，合法值为 1、2、3。不是这 3 个数则为非法数字。
编程统计每个 整数和非法数字的个数。*/
import java.util.*;
public class Demo06{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		int [] a=new int[10];
		int sum1=0;
		int sum2=0;
		for(int i=0;i<10;i++){
			System.out.print("请输入第"+(i+1)+"位整数：");
			a[i]=input.nextInt();
			if(a[i]==1||a[i]==2||a[i]==3){
				sum1++;
			}else{
				sum2++;
			}
		}
		System.out.println("合法值有："+sum1+"个");
		System.out.println("非法数字有："+sum2+"个");
	}	
}