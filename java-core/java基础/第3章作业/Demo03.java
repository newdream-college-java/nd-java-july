/*银行密码问题*/
import java.util.Scanner;
public class Demo03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入第一道密码：");
		int a=input.nextInt();
		if(a==123456){
			System.out.print("请输入第二道密码：");
			int b=input.nextInt();
			if(b==654321){
				System.out.println("恭喜你发财啦！！！");
			
			}else{
				System.out.println("第二道密码错误！！！");
			}
		}else{
			System.out.println("第一道密码错误！！！");
		}
		
	}
}