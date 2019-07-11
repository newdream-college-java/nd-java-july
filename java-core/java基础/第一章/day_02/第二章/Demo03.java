/*3、输入一个四位数的整数，要求编程将这个四位数中的个位，十位，百位，千位分别输出。*/
import java.util.*;
public class Demo03{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		System.out.print("请输入一个四位数：");
		int a=input.nextInt();
		int b,c,d,e;
		b=a%10;
		c=a/10%10;
		d=a/100%10;
		e=a/1000;
		System.out.println("个位="+b+"     十位="+c+"     百位="+d+"   千位="+e);

	}
}