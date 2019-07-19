import java.util.Scanner;

/*
 以表格的形式输出 5 笔购物金额及总金额 创建一个长度为 5 的 double 类型数组存
储购物金额 循环输入五笔购物金额， 并累加总金额 利用循环输出五笔购物金额，
最后输出总金额 
 */
public class Demo02 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入会员本月的消费记录");
		double xfs[]=new double[5];
		double sum=0;
		for(int i=0;i<xfs.length;i++){
			System.out.print("请输入第"+(i+1)+"笔金额：");
			xfs[i]=input.nextDouble();
			sum+=xfs[i];
		}
		System.out.println("序号\t\t金额(元)");
		for(int i=0;i<xfs.length;i++){
			System.out.println((i+1)+"\t\t"+xfs[i]);
		}
		System.out.println("总金额\t\t"+sum);
	}
}
