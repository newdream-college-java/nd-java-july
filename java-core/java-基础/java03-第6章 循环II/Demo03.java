/*练习1：循环输入100次密码，如果密码正确停止输入，提示密码正确？
old 旧的
new 新的

origin :原始的
password密码
*/
import java.util.*;
public class Demo03{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		Random rd = new Random();
		//原始密码---随机的
		//int originPassword = rd.nextInt(900)+100;  //100~999
		int originPassword = rd.nextInt(3);
		for(int i=1;i<=100;i++){
			//提示
			System.out.println("请输入密码：");
			//输入的密码
			int inPassword = input.nextInt();
			if(originPassword==inPassword){
				System.out.println("恭喜你密码正确！！");
				break;//中止循环
			}
		}
	}
}