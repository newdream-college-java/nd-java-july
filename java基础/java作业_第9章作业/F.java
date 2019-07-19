import java.util.Scanner;
public class F{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("输入10个整数");
		
		int b=0;
		int c=0;
		for(int i=1;i<=10;i++){
			System.out.println("请输入第"+i+"位数：");
			int a = input.nextInt();
		if(a==1||a==2||a==3){
		b++;
		}else {
		c++;
		}
		}
		System.out.println("合法数的个数有："+b+"不合法的个数有："+c);
		}
}