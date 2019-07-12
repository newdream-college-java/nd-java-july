/*
3、现在有一个银行保险柜，有两道密码。想拿到里面的钱必须两次输入的密码都要正确。
如果第一道密码都不正确，那直接把你拦在外面；如果第一道密码输入正确，才能有权输入第
二道密码。只有当第二道密码也输入正确，才能拿到钱！(两道密码自己设，要求密码长度不
能低于 6 位)
请输入第一道密码;
if(第一道密码正确){
请输入第 2 道密码;
if(第 2 道密码正确){
恭喜拿到钱了
}else{
第 2 道密码错误
}
}else{
第 1 道密码错误
}
*/
import java.util.Scanner;
public class Demo03{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入第一道密码：");
		int password1 = input.nextInt();
		/*判断密码1长度*/
		while(password1<=99999){
			System.out.print("密码过短，请重新输入：");
			int password01 = input.nextInt();
			password1 = password01;
		}
		int p1 =123456;
		int p2 = 123123;
		/*判断密码2长度*/
		if(password1 == p1){
			System.out.print("请输入第二道密码：");
			int password2 = input.nextInt();
			while(password2<=99999){
				System.out.print("密码过短，请重新输入：");
				int password02 = input.nextInt();
				password2 = password02;
			}
			if(password2 == p2)
				System.out.println("恭喜你，你的卡里没钱了！");
			else
				System.out.println("密码错误！！！");
		}
		else
			System.out.println("密码错误！！！");
			
		
	}
}