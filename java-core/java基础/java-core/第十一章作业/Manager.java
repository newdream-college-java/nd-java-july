package chapter_11;

public class Manager {
		String userName;
		String passWord;
		public String show(){
			return "管理员信息用户名为："+userName+"\t密码："+passWord;
		}
	public static void main(String[] args) {
		Manager manager01 =new Manager();
		manager01.userName="newgream";
		manager01.passWord="0000";
		System.out.println(manager01.show());
		

	}

}
