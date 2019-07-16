import java.util.Scanner;
public class Demo06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String username;
		int password;
		for(int i=3;i>0;i--){
			System.out.print("请输入用户名:");
			username=input.next();
			System.out.print("请输入密码");
			password=input.nextInt();
			if(username.equals("jim")&&password==123456){
				System.out.println("欢迎登陆MyShopping系统");
				break;
			}else if(i==1){
				System.out.println("对不起，您3次输入均错误！");
			}else{
				System.out.println("输入错误你还有"+(i-1)+"次机会！");
			}
		}
	}
}