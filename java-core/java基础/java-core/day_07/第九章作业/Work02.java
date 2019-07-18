/*1.2以表格的形式输出 5 笔购物金额及总金额 创建一个长度为 5 的 double 类型数组存储购物金额 循环输入五笔购物金额， 并累加总金额 利用循环输出五笔购物金额，最后输出总金额*/
import java.util.*;
public class Work02{
	public static void main(String[] args ){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入会员本月的消费记录");
		double[] p=new double[5];
		double sum=0;
		for(int i=0;i<5;i++){
			System.out.print("请输入第"+(i+1)+"笔购物金额：");
			p[i]=in.nextDouble();
			sum+=p[i];
		}
		System.out.println();
		System.out.println("序号\t金额（元）");
		for(int i=0;i<5;i++){
			System.out.print(i+1+"\t"+p[i]+"\n");
		}
		System.out.println("总金额\t"+sum);
	}
}