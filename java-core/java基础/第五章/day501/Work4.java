/*1.4、循环问“你的名字叫什么？”，如果回答的是“不告诉你”，就继续问，
否则输出“你的名字原来叫：**”。编程实现。*/
import java.util.Scanner;
public class Work4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a ;
		do{
			System.out.println("你的名字叫什么？");
			a = sc.next();
		}while(a.equals("不告诉你"));
		System.out.println("原来你的名字叫"+a);
	}
}