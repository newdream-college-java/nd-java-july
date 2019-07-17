import java.util.Scanner;
public class hw4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("输入数字999即可退出");
		int a=0;
		int b=0;
		int c=0;
		double num;
		do{
			System.out.print("请输入一个数字");
			num=sc.nextDouble();
			if(num>0){
				a++;
			}else if(num==0){
				b++;
			}else {
				c++;
			}
		}while(num!=999);
		System.out.println("正数的个数为"+a);
		System.out.println("零的个数为"+b);
		System.out.println("负数的个数为"+c);
	}
}