/*1.7、循环输入大于 0 的数字进行累加， 直到输入的数字为 0，就结束循环，并最后输出累加的结果。*/
import java.util.*;
public class G{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入数字：");
		int a=input.nextInt();
		int sum=0;
		while(a!=0){
			sum+=a;
			System.out.print("请输入数字：");
			a=input.nextInt();
		}
		System.out.println("总和为："+sum);
	}
}