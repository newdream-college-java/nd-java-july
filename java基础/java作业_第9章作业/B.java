import java.util.Scanner;
public class B{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		double sum=0;
		double[] money =new double[5];
		for(int i=0;i<5;i++){
		System.out.print("请输入第"+(i+1)+"笔购物金额：");
		money[i] = input.nextDouble();
		sum+=money[i];
		}
		System.out.println("/n");
		System.out.println("序号/t/t/t金额（元）");
		for(int i=0;i<5;i++){
		System.out.println((i+1)+"\t\t\t"+money[i]);
		}
		System.out.println("总金额\t\t\t"+sum);
}
}
		