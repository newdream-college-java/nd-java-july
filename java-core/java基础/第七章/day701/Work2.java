/*1.2、循环输入字符串，将这些输入的字符串都连接起来，直到输入的字符串为“Esc”
就结束循环，最后显示这个连接起来的字符串。
比如：输入 abc 输入 def 输入 Esc
就输出 abcdef*/
import java.util.Scanner;
public class Work2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String sum="";	//定义一个空字符串
		while(true){
			System.out.print("请输入字符串：");
			String s = sc.next();
			//System.out.println(sum);	//判断sum中是否有Esc
			if(s.indexOf("Esc")!=-1){
				break;
			}
			sum = sum+s;
		}
		System.out.println("字符串为："+sum);
	}
}