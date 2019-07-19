import java.util.Scanner;

public class Demo02 {

	/**
	 * 以表格的形式输出 5 笔购物金额及总金额 创建一个长度为 5 的 double 类型数组存 储购物金额 循环输入五笔购物金额， 并累加总金额
	 * 利用循环输出五笔购物金额， 最后输出总金额
	 */
	public static void main(String[] args) {
		System.out.println("请输入会员本月的消费记录");
		Scanner input = new Scanner(System.in);
		double sum = 0;
		double[] index = new double[5];
		for (int i = 1; i <= 5; i++) {
			System.out.print("请输入第" + i + "笔购物金");
			double data = input.nextDouble();
			index[i - 1] = data;
			sum += data;

		}
		System.out.println("序号\t\t金额");
		for (int j = 0; j < index.length; j++) {
			System.out.println(j + 1 + "\t\t" + index[j]);
		}
		System.out.println("总金额\t\t" + sum);
	}

}
