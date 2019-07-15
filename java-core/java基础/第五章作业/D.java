/*1.4、循环问“你的名字叫什么？”，如果回答的是“不告诉你”，就继续问，否则输出“你的名字原来叫：**”。编程实现。*/
import java.util.*;
public class D{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("你的名字叫什么？");
		String s1=input.next();
		String s2="不告诉你";
		while(s1.equals(s2)){
			System.out.println("你的名字叫什么？");
			s1=input.next();
		}
		System.out.println("原来你的名字叫"+s1);
	}
}