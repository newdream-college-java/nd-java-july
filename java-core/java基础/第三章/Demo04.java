/*
4、输出"你爱我吗？",如果回答的是"yes",则输出"你是爱我的",如果回答的是"no",则输出"原来 你不爱我",如果回答的是其它，则输出"你到底是爱还是不爱，自己也不清楚". 
*/
import java.util.*;
public class Demo04{
	public static void main(String [] args){
		System.out.println("你爱我吗？");
		Scanner input = new Scanner(System.in);
		String x = input.next();
		if(x.equals("yes"))
		System.out.print("你是爱我的");
		else if(x.equals("no"))
		System.out.print("原来 你不爱我");
		else
		System.out.print("你到底是爱还是不爱，自己也不清楚");
	}
}