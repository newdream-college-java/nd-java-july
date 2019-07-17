import java.util.Scanner;
public class E{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int a = input.nextInt();
		double sum=0;
		for(int i =1;i<=a;i++){
		sum+=1.0/i;
		}
		if(a>0){
		System.out.println("求和为："+sum);
		}else {
		System.out.println("输入错误！");
		}
}
}
		