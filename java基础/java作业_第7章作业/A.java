import java.util.Scanner;
public class A{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入正整数（1~10）：");
		int a = input.nextInt();
		int c =1;
		if(a<1||a>10){
		System.out.println("错误");
		System.exit(-1);
		}
		System.out.print(a+"!=");
		for(int i=1;i<=a;i++){
		c=c*i;
		if(i==a){
		System.out.print(i);
		}else {
		System.out.print(i+"*");
		}
		}
		System.out.print("="+c);
}
}