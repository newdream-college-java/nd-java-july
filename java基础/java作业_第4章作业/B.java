import java.util.Scanner;
public class B{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入猴子买的桃数：");
		int a = input.nextInt();
		int b = a+1;
		int c = a+2;
		if(a<3){
		System.out.println("买到了"+a+"个桃子。");
		}else if(a>=3 && a<=5)
		{
		
		System.out.println("买到了"+b+"个桃子。");
		}else 
		{
		System.out.println("买到了"+c+"个桃子");
		}
}
}
		
		
		