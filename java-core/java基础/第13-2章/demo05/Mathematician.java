/*1.4��дһ����ѧ�ҵ��࣬�����д������ķ�������: 
a)����һ�����ε����飬����������������е���������֮�͵ķ�����
b)����һ�����ε����飬����������������е����ֵ�ķ���*/
package demo05;

public class Mathematician {
	//�������������е���������֮�͵ķ�����
	public int add(int a[]){
		int count=0;
		for (int i = 0; i < a.length; i++) {
			count +=a[i];
		}
		return count;
	}
	//�������������е����ֵ�ķ���
	public int max(int a[]){
		int max=a[0];
		for (int i = 1; i < a.length; i++) {
			if(max<a[i]){
				max=a[i];
			}
		}
		return max;
	}
}
