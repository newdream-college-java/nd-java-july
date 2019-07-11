/*8、(挑战题)输入一个小数，然后输出其整数部份和小数部份,格式如下
小数 整数部份 小数部份
3.14     3            0.14  */
import java.util.*;
public class Demo08{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("请输入小数：");
		double n=in.nextDouble();
		double b;
		int a;
		a=(int)n;
		b=n-a;
		System.out.println("小数\t整数部分\t小数部分");	
		System.out.println(n+"\t"+a+"\t"+b);
	}
}