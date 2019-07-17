/*循环输入字符串，将这些输入的字符串都连接起来，直到输入的字符串为“Esc”
就结束循环，最后显示这个连接起来的字符串。*/
import java.util.*;
public class Demo02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入字符串：");
		String a=input.next();
		String sum="";
		while(!a.equals("Esc")){
			sum+=a;
			System.out.print("请输入字符串：");
			a=input.next();
		}
		System.out.println("你输入的字符串是："+sum);
		System.out.println("程序结束！");
	}
}