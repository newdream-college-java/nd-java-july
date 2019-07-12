/*现在有一个银行保险柜，有两道密码。*/

import java.util.Scanner;
public class A3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入第一道密码");
		int a = input.nextInt();		
		if(a == 145610){
			System.out.print("请输入第二道密码");
			int b = input.nextInt();
			if(b == 199701){
				System.out.print("恭喜拿到钱了");
			}else {
				System.out.print("第二道密码错误");
			}
		}else {
			System.out.print("第一道密码错误");
		}
	}
}
