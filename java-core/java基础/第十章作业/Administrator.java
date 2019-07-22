
import java.util.Scanner;
public class Administrator{
	String name;
	int passWord;
	public void show(){
		System.out.println("姓名："+name+"，密码："+passWord);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Administrator admin1=new Administrator();
		Administrator admin2=new Administrator();
		admin1.name="admin1";
		admin2.name="admin2";
		admin1.passWord=111111;
		admin2.passWord=222222;
		admin1.show();
		admin2.show();
		System.out.print("请输入用户名");
		String a=sc.next();
		System.out.print("请输入密码");
		int b=sc.nextInt();
		if(a.equals(admin1.name)&&b==admin1.passWord||a.equals(admin2.name)&&b==admin2.passWord){
			System.out.print("输入y选择修改密码，输入其它选择退出");
			String choice=sc.next();
			if(choice.equals("y")){
				System.out.print("请输入新密码");
				int m=sc.nextInt();
				admin1.passWord=m;
				System.out.print("输入成功，你的新密码为"+admin1.passWord);
			}
		}else{
			System.out.print("用户名和密码不匹配！您没有权限更新管理员信息");
		}
	}

}
