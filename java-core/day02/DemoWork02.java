import java.util.Scanner;
public class DemoWork02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//1.输入两小数，存入a,b中，编程实现a与b变量中的值交换，最后输出a与b中的值
		System.out.println("请输入两个(小数)");
		double a=input.nextDouble(),b=input.nextDouble(),c;
		System.out.println("第一题：a="+a+",b="+b+",a与b交换后。");
		c=a;
		a=b;
		b=c;	
		System.out.println("a="+a+"\tb="+b);
		System.out.println("********************分割线**********************");
		//2.输入一个变量保存正方形的边长，计算此周及面积。
		System.out.println("第二题：请输入正方形的边长:。");
		double length=input.nextDouble(),perimeter,area;
		perimeter=4*length;
		area=length*length;
		System.out.println("正方形的边长"+length+"\n正方形周长"+perimeter+"\n正方形面积为："+area);
		//3、输入一个四位数的整数，要求编程将这个四位数中的个位，十位，百位，千位分别输出。
		System.out.println("********************我是黄金分割线**********************");
		System.out.println("第三题：输入一个四位数的整数，要求编程将这个四位数中的个位，十位，百位，千位分别输出。");
		int theInteger=input.nextInt();
		int bits=theInteger%10;
		int ten=theInteger/10%10;
		int best=theInteger/100%10;
		int thousand=theInteger/1000%10;
		System.out.println("个位\t十位\t百位\t千位");
		System.out.println(bits+"\t"+ten+"\t"+best+"\t"+thousand);
		System.out.println("********************我是黄金分割线**********************");
		
		//4、输入两个整数，放入到两个变量 a 与 b 中，编程将 a 与 b 中的值交换，输出
		System.out.println("第四题：4、输入两个整数，放入到两个变量 a 与 b 中，编程将 a 与 b 中的值交换，输出");
		int oneInteger=input.nextInt(),twoInteger=input.nextInt(),threeInteger;
		threeInteger=oneInteger;
		oneInteger=twoInteger;
		twoInteger=threeInteger;
		System.out.println("a="+oneInteger+"\tb="+twoInteger);
		System.out.println("********************我是黄金分割线**********************");
		
		//5.输入一个整数，代表有 n 个小时，计算 n 个小时等于多少天零多少个小时。比如输入：25，那么输出“1 天零 1 个小时
		System.out.println("题目五：输入一个整数，代表有 n 个小时，计算 n 个小时等于多少天零多少个小时");
		int oneInt=input.nextInt(),day,time;
		time=oneInt%24;
		day=oneInt/24;
		System.out.println(day+"天"+time+"时");
		System.out.println("********************我是黄金分割线**********************");
		
		//6、输入一个 3 位数，分别放入到 3 个变量中去，编程将这 3 个变量中的值交换后输出。比如输入 123 三个数放入到 a,b,c 中去，最后输出 a,b,c 的值，要求输出 321。
		System.out.println("题目六：输入一个 3 位数，分别放入到 3 个变量中去，编程将这 3 个变量中的值交换后输出。");
		int sumInteger=input.nextInt();
		int aInteger=sumInteger/100%10;
		int bInteger=sumInteger/10%10;
		int cInteger=sumInteger%10;
		int dInteger;
		dInteger=aInteger;
		aInteger=cInteger;
		cInteger=dInteger;
		System.out.println("a="+aInteger+"\tb="+bInteger+"\tc="+cInteger);
		System.out.println("********************我是黄金分割线**********************");
		
	}

}