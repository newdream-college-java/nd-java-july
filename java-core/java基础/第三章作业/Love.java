/*4、输出"你爱我吗？",如果回答的是"yes",则输出"你是爱我的",如果回答的是"no",则输出"原来
你不爱我",如果回答的是其它，则输出 你到底是爱还是不爱，自己也不清楚".*/
import java.util.Scanner;
public class Love{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("你爱我吗？");
		String s=input.next();
		if(s.equals("yes")){
			System.out.println("你是爱我的！");
		}else if(s.equals("no")){
			System.out.println("你不爱我！");
		}else {
			System.out.println("你到底是爱还是不爱，自己也不清楚");
		}
	}
}