/*3、输入一个四位数的整数，要求编程将这个四位数中的个位，十位，百位，千位分别输出。 */
import java.util.Scanner;
public class C{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个四位整数：");
		int a = input.nextInt();
		int g = a%10;
		int s = a/10%10;
		int b = a/100%10;
		int q = a/1000%10; 
		System.out.println("个位："+g+"\t十位："+s+"百位："+b+"千位："+q);
}
}
		
		