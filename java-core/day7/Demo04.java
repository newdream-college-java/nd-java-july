import java.util.Scanner;
public class Demo04{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		/*1.5、输入一个整数 n，如果 n 大于 0，
则求和:1+1/2+1/3+...+1/n，否则输出：输入错误*/
		double data=input.nextDouble();
		double sum=0;
		if(data<0){
			System.out.println("输入出错误");
			return;
		}
		for(int i=1;i<=data;i++){
			sum+=(1/data);
		}
		System.out.println("和为"+sum);
	}
}