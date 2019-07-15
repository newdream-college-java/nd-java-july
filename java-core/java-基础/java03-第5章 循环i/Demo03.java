/*输入一个字符串判断，这个字符是数字，还是大写字母，还是小写字母，还是其他？*/
import java.util.Scanner;
public class Demo03{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//提示
		System.out.println("请输入一个字符？");
		//扫描输入字符串，在从字符串中取出第0号索引的字符
		char ch = input.next().charAt(0);
		if(ch>=65&&ch<=90){
			System.out.println("亲，你输入我猜是：大写字母");
		}else if(ch>=97&&ch<=122){
			System.out.println("亲，我猜你输入的是：小写字母");
		}else if(ch>=48&&ch<=57){
			System.out.println("亲，我猜你输入的是：数字");
		}else{
			System.out.println("亲，我猜你输入的是：汉字");
		}
	}
}