import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		/*1.2、循环输入字符串，将这些输入的字符串都连接起来，直到输入的字符串为“Esc就结束循环，最后显示这个连接起来的字符串。
比如：输入 abc 输入 def 输入 Esc
  就输出 abcdef*/
		Scanner input=new Scanner(System.in);
		System.out.println("输入字符串,将这些输入的字符串都连接起来,Esc就结束");
		String data;
		String sum="";
		for(;;){
			data=input.next();
			if(data.equals("Esc")){
				System.out.println();
				break;
			}
			sum+=data;	
		}
		System.out.println(sum);
	}
}