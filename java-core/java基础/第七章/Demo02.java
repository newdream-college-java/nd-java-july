/*
1.2、循环输入字符串，将这些输入的字符串都连接起来，直到输入的字符串为“Esc”
就结束循环，最后显示这个连接起来的字符串。 
比如：输入 abc      输入 def        输入 Esc 
      就输出 abcdef 
*/
import java.util.*;
public class Demo02{
	public static void main (String []args){
		Scanner input = new Scanner(System.in);
		String result="";
		while(true){
			System.out.print("输入");
			String a = input.next();
			if(!a.equals("Esc")){
				result+=a;
					
			}else{
				System.out.print("结果为："+result);
				break;
			}
		}
	}
}