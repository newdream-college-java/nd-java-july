package proJob11.text1;

/*��д����Ա Manager��ʹ�� show()�������ع���Ա��Ϣ(ʹ�� return ���ʵ����Ϣ
�ķ���)*/
public class Manager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show();
	}
	
	public static String names(){
		String name="newdream";
		return name;
	}
	
	public static String password(){
		String psw="0000";
		return psw;
	}
	public static void show() {
		System.out.println("����Ա��Ϣ�û���Ϊ��"+names()+"\t����Ϊ��"+password());
	}
}
