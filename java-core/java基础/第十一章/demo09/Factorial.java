/*2�� ��дһ�������� n!(n �Ľ׳�)���õݹ鷽��ʵ�� ��ʾ:�ݹ鷽��ֱָ�ӻ���
�ص�������ķ�����n �Ľ׳˵ݹ�ɱ�ʾ*/
package demo09;

public class Factorial {
	public int jiechen(int n){
		if(n<=1){
			return 1;
		}
		return n*jiechen(n-1);
	}
}
