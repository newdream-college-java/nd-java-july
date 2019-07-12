/*2.6、编程实现迷你计算器：支持+、-、*、/，从控制台输入 2 个操作数，输出运 算结果。*/
import java.util.*;
public class Work07{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入两个操作数：");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("请输入你要进行的操作：");
		String s=sc.next();
		if(s.equals("+")){
			System.out.println(a+b);
		}else if(s.equals("-")){
			System.out.println(a-b);
		}else if(s.equals("*")){
			System.out.println(a*b);
		}else  if(s.equals("/")){
			System.out.println(a/b);
		}else {
			System.out.println("请输入正确的操作哦！");
		}
	}

}