import java.util.Scanner;
public class D{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("你的名字叫什么：");
		String a = input.next();
		while(a.equals("不告诉你"))
		{
		System.out.println("你的名字叫什么：");
		a = input.next();
		}
		System.out.println("原来你叫："+a);
}
}