/**��д����Ա Manager��ʹ�� show()�������ع���Ա��Ϣ(ʹ�� return ���ʵ����Ϣ
*�ķ���)
*/

public class Manager {
	String[] test={"newdream","0000"};
	public String[] show(){
		return test;
	} 
	public static void main(String[] args) {
		Manager test=new Manager();
		//test.show();
		System.out.println("����Ա��Ϣ�û���Ϊ"+test.show()[0]+"����Ϊ"+test.show()[1]);
	}
}
