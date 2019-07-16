import java.util.Scanner;
public class I{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int b=0;
		int c=0;
		for(int i =1;i<=10;i++){
		System.out.println("请输入第"+i+"位顾客的年龄：");
		int a = input.nextInt();
		
		if(a>30){
		b++;
		}else {
		c++;
		}
		}
		double d = b/10.0*100.0;
		double e = c/10.0*100.0;
		System.out.println("30岁以上的比例是："+d+"%");
		System.out.println("30岁以下的比例是："+e+"%");
}
}