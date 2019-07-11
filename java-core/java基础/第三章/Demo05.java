/*
5、输入三个 int 型的数据，放入到 a,b,c 三个变量中去，使用条件结构与交换逻辑将
这三个变量中的值从小到大排列
*/
import java.util.*;
public class Demo05{
	public static void main(String [] args){
		System.out.println("请输入三个int型的数据");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int x = 0;
		if(a<b){
		x=a;a=b;b=x;
		}
		if(a<c){
		x=a;a=c;c=x;
		}
		if(b<c){
		x=b;b=c;c=x;
		}
		System.out.print(c+"\t"+b+"\t"+a);
	}
}