/*3、输入一个四位数的整数，要求编程将这个四位数中的个位，十位，百位，千位分别输出。*/
import java.util.Scanner;
public class Work3{
	public static void main(String[] args){
		Scanner x = new Scanner(System.in);
		int a = x.nextInt();
		if(a>999||a<10000){
			System.out.println("个位为："+a%10);
			System.out.println("十位为："+a/10%10);
			System.out.println("百位为："+a/100%10);
			System.out.println("千位为："+a/1000%10);
		}else System.out.println("数据错误");
	}
}