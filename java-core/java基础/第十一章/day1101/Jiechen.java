package Work;
/**
 * 2�� ��дһ�������� n!(n �Ľ׳�)���õݹ鷽��ʵ�� ��ʾ:�ݹ鷽��ֱָ�ӻ���
	�ص�������ķ�����n �Ľ׳˵ݹ�ɱ�ʾ
 */
public class Jiechen {
	public int jiechen(int n) {
		if (n<=1) {
			return 1;
		}
		return n*jiechen(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jiechen jc = new Jiechen();
		System.out.println(jc.jiechen(5));
	}
}
