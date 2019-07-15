import java.util.Scanner;
public class A4{
	public static void main(String[] args ){
		Scanner input = new Scanner (System.in);
		System.out.print("你的名字是什么?");
		String name = input.next();
		while(name.equals("不告诉你")){
			System.out.print("你的名字是什么?");
			name = input.next();
		}
		System.out.print("你的名字原来叫："+name);
	}
}