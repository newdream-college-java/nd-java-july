package work;

/**
 * 1.4��дһ����ѧ�ҵ��࣬�����д������ķ�������: a)����һ�����ε����飬����������������е���������֮�͵ķ�����
 * b)����һ�����ε����飬����������������е����ֵ�ķ���
 */

public class MathMan {
	public int getSum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	public int getMax(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max<a[i]) {
				max=a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] a = {5,3,2,6,9,1};
		MathMan man = new MathMan();
		System.out.println(man.getSum(a));
		System.out.println(man.getMax(a));
	}

}
