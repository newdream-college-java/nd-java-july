	/**
	 * 1.1������˵��
		��д����Ա Manager��ʹ�� show()�������ع���Ա��Ϣ(ʹ�� return ���ʵ����Ϣ
		�ķ���)
	 */
package Work;

public class Manager {
	String name = "admin";
	String passWord = "0000";
	public String returnName() {
		return name;
	}
	public String returnPassWord() {
		return passWord;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
		System.out.println("����Ա�û�����"+manager.returnName()+"\t�û����룺"+manager.returnPassWord());
	}

}
