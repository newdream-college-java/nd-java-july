import java.util.Arrays;

/**
 * 1.4��дһ����ѧ�ҵ��࣬�����д������ķ�������: 
a)����һ�����ε����飬����������������е���������֮�͵ķ�����
b)����һ�����ε����飬����������������е����ֵ�ķ���
 * @author 54975
 *
 */
public class Math {
	/**
	 * ����һ�����ε����飬����������������е���������֮�͵ķ���
	 * @param a
	 * @return
	 */
	public int setArray(int[] a){
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	/**
	 * ����һ�����ε����飬����������������е����ֵ�ķ���
	 */
	public int setmax(int[] a){
		int max=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max){
				max=a[i];
			}
		}
		return max;
		/*
		 * �ڶ��ַ���
		 * Arrays.sort(a);
		return a[a.length-1];*/
	}
	/**
	 * ��֤
	 */
	public static void main(String[] args) {
		int[] a={2,2,5,6,1,3,5,6};
		Math m=new Math();
		System.out.println(m.setArray(a));
		System.out.println(	m.setmax(a));
	}
}
