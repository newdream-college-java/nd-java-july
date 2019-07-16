/*循环输入大于 0 的数字进行累加，
直到输入的数字为 0，就结束循环，并最后输出累加的结果。*/
import java.util.*;
public class Demo07{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入值（按enter继续输入，按0结束输入）：");
		int sum=0;
		int i;
		do{
			i=input.nextInt();
			sum+=i;
		}while(i!=0);
		System.out.println("你输入的数的和为："+sum);
	}
}