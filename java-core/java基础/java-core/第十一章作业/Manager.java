package chapter_11;

public class Manager {
		String userName;
		String passWord;
		public String show(){
			return "����Ա��Ϣ�û���Ϊ��"+userName+"\t���룺"+passWord;
		}
	public static void main(String[] args) {
		Manager manager01 =new Manager();
		manager01.userName="newgream";
		manager01.passWord="0000";
		System.out.println(manager01.show());
		

	}

}
