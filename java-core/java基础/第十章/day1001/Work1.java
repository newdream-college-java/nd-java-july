
	/**
	 * 编写管理员类(属性:用户名，密码;方法:show()显示管理员信息) 
	 * 创建两个管理员类对象，输出他们的相关信息
	 */
import java.util.Scanner;
public class Work1{
	String name;
	int passWord;
	public void printAdmin(){
		System.out.println("姓名："+name+"\t密码:"+passWord+"\n");
	}
	public void checkPassWord(){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入用户名：");
		if(sc.next().equals(name)){
			System.out.print("请输入密码：");
			if(sc.nextInt()==passWord){
				System.out.println("\n");
				changePassWord();
			}
			else
				System.out.println("密码错误!");
		}else
			System.out.println("用户名错误");
	}
	public void changePassWord(){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入新密码：");
		passWord =sc.nextInt();
		System.out.println("修改密码成功，您的新密码为："+passWord);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Work1 admin1 = new Work1();
		Work1 admin2 = new Work1();
		admin1.name = "admin1";
		admin1.passWord = 111111;
		admin2.name = "admin2";
		admin2.passWord = 222222;
		admin1.printAdmin();
		admin2.printAdmin();
		admin1.checkPassWord();
		admin1.changePassWord();
	}
}

