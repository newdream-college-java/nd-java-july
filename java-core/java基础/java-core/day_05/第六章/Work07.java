/*1.7、循环输入大于 0 的数字进行累加， 直到输入的数字为 0，就结束循环，并最后输出累加的结果。*/
import java.util.Scanner;
public class Work07{
	public static void main(String[] args ){
		Scanner sc= new Scanner(System.in);
		System.out.print("请输入数字相加，输入0结束：");
		double sum=0;
		for(;;){
			
			double a=sc.nextDouble();
			if(a==0){
				break;
			}
			sum+=a;
		}
		System.out.println("你输入的数字和为："+sum);
	}
}