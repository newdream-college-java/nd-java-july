/*、输入三个 int 型的数据，放入到 a,b,c 三个变量中去，使用条件结构与交换逻辑将 
这三个变量中的值从小到大排列。  */

import java.util.Scanner;

public class E{
	public static void main (String[] args){
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	int b=input.nextInt();
	int c=input.nextInt();
	if(a>c){
	a=a+c;
	c=a-c;
	a=a-c;
	}
	if(a>b){
	a=a+b;
	b=a-b;
	a=a-b;
	}
	if(b>c){
	b=b+c;
	c=b-c;
	b=b-c;
	}
	System.out.println(a+""+b+""+c);
	}
}