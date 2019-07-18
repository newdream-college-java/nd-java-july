import java.util.Scanner;
public class hw2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入会员本月消费次数:");
		int a=sc.nextInt();
		double b[]=new double[a];
		double sum=0;
		System.out.print("请输入会员本月的消费记录");
		for(int i=1;i<=a;i++){
			System.out.print("请输入第"+i+"笔购物金额：");
			b[i-1]=sc.nextDouble();
			sum+=b[i-1];
		}
		System.out.println("序号\t\t\t金额");
		for(int i=1;i<=a;i++){
			System.out.println(i+"\t\t\t"+b[i-1]);
		}
		System.out.print("总金额\t\t\t"+sum);
	}
}