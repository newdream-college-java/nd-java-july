/*2.6、编程实现迷你计算器：支持+、-、*、/，从控制台输入 2 个操作数，输出运 算结果。*/
import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入第一个数：");
		double a=input.nextInt();
		System.out.print("请输入运算符：");
		char c=input.next().charAt(0);
		System.out.print("请输入第二个数：");
		double b=input.nextInt();
		double result=0;
		switch(c){
			case '+':
				result=a+b;
				System.out.println("结果："+a+"+"+b+"="+result);	
			break;
			case '-':
				result=a-b;
				System.out.println("结果："+a+"-"+b+"="+result);	
			break;
			case '*':
				result=a*b;
				System.out.println("结果："+a+"*"+b+"="+result);
			break;
			case '/':
				if(b==0){
					System.out.println("被除数不能为0！");	
					return;
				}
				else{
					result=a/b;
					System.out.println("结果："+a+"/"+b+"="+result);
				}
			break;
		}	
	}
}