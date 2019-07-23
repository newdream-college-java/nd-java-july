
public class Domo01 {
	//编写管理员类(属性:用户名，密码;方法:show()显示管理员信息)
	String userName;
	String passWord;
	public void show(){
		System.out.println("用户名:"+userName+"，密码:"+passWord);
	}
	public static void show(Domo01 a){
		System.out.println("用户名:"+a.userName+"，密码:"+a.passWord);
	}
}
