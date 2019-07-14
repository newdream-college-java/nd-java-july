import java.util.Scanner;
public class F{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入几月几号：");
		int a = input.nextInt();
		int b = input.nextInt();
		int c;
		if(a==1){
		c = b;
		System.out.println("从今年1月1日到今天的天数是："+c);
		}else if(a==2)
		{
		c =31+b;
		System.out.println("从今年1月1日到今天的天数是："+c);
		}else if(a==3)
		{
		c=31+28+b;
		System.out.println("从今年1月1日到今天的天数是："+c);
		}else if(a==4)
		{
		c=31*2+28+b;
		System.out.println("从今年1月1日到今天的天数是："+c);
		}else if(a==5)
		{
		c=31*2+28+30+b;
		System.out.println("从今年1月1日到今天的天数是："+c);
		}else if(a==6)
		{
		c=31*3+28+30+b;
		System.out.println("从今年1月1日到今天的天数是："+c);
		}else if(a==7)
		{
		c=31*3+28+30*2+b;
		System.out.println("从今年1月1日到今天的天数是："+c);
		}else if(a==8)
		{
		c=31*4+28+30*2+b;
		System.out.println("从今年1月1日到今天的天数是："+c);
		}else if(a==9)
		{
		c=31*5+28+30*2+b;
		System.out.println("从今年1月1日到今天的天数是："+c);
		}else if(a==10)
		{
		c=31*5+28+30*3+b;
		System.out.println("从今年1月1日到今天的天数是："+c);
		}else if(a==11)
		{
		c=31*6+28+30*3+b;
		System.out.println("从今年1月1日到今天的天数是："+c);
		}else if(a==12)
		{
		c=31*6+28+30*4+b;
		System.out.println("从今年1月1日到今天的天数是："+c);
		}else
		{
		System.out.println("输入错误！");
		}		
}
}

		