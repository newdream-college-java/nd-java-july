import java.util.Scanner;
public class Day02Demo03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//4、输出"你爱我吗？",如果回答的是"yes",则输出"你是爱我的",如果回答的是"no",则输出"原来你不爱我",如果回答的是其它，则输出"你到底是爱还是不爱，自己也不清楚
		System.out.println("你爱我码？");
		String i=input.next();
		if(i.equals("yes")){
			System.out.println("你是爱我的");
		}else if(i.equals("no")){
			System.out.println("原来你不爱我");
		}else{
			System.out.println("你到底是爱还是不爱，自己也不清楚");
		}
		//输入三个 int 型的数据，放入到 a,b,c 三个变量中去，使用条件结构与交换逻辑将这三个变量中的值从小到大排列
		System.out.println("*******************我是黄金分割线**********************");
		System.out.println("请输入a的值");
		int a=input.nextInt();
		System.out.println("请输入b的值");
		int b=input.nextInt();
		System.out.println("请输入c的值");
		int c=input.nextInt();
		int d;
		if(a<b){
			d=a;
			a=b;
			b=d;
		}else if(a<c){
			d=a;
			a=c;
			c=d;
		}else if(b<c){
			d=b;
			b=c;
			c=d;
		}
		System.out.println("三个变量中的值从小到大排列:"+a+">"+b+">"+c);
	}
}