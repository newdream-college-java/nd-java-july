/*
1.2、循环输入字符串，将这些输入的字符串都连接起来，直到输入的字符串为“Esc”
就结束循环，最后显示这个连接起来的字符串。
比如：输入 abc 输入 def 输入 Esc
 就输出 abcdef
*/
import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String sum = "";
		System.out.print("请输入一个字符：");
		String a = input.next();
		while(!(a.equals("Esc"))){	
			sum+=a;
			System.out.print("请继续输入：");
			a =input.next();
		}	
		System.out.println("输出结果为："+sum);	
	}
}