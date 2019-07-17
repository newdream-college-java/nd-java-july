import java.util.Scanner;
public class hw5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入一个正整数");
		int num=sc.nextInt();
		double sum=0;
		if(num>0){
			for(int i=1;i<=num;i++){
				sum+=1.0/i;
			}
			System.out.print("和为"+sum);
		}else {
			System.out.print("输入错误");
		}
	}
}
		