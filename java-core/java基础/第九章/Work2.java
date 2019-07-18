package nine;

import java.util.Scanner;

public class Work2 {

	/**
	 * 以表格的形式输出 5 笔购物金额及总金额 创建一个长度为 5 的 double 类型数组存
	 *储购物金额 循环输入五笔购物金额， 并累加总金额 利用循环输出五笔购物金额，
	 *最后输出总金额
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a = new double[5];
		double count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入会员本月的消费记录");
		for (int i = 0; i < a.length; i++) {

			System.out.print("请输入第"+(i+1)+"笔购物金额：");
			a[i]=sc.nextDouble();
			System.out.println();
			count+=a[i];
		}
		System.out.println("序号\t\t\t金额(元)");
		for (int i = 0; i < a.length; i++) {
			System.out.println(i+1+"\t\t\t"+a[i]);
		}
		System.out.println("总金额\t\t\t"+count);
		
	}

}
