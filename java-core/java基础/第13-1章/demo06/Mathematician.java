/*
1.6��дһ����ѧ�ҵ��࣬�����д������ķ�������:	
a)�����������������бȽϣ������������е����ֵ�ķ�����
b)����һ��������������������ĸ�λ���Ǽ��ķ�����
c)����һ��������������������������ķ�����
d)����һ��������������� 1 �ӵ��������ĺ��Ƕ��ٵķ�������������һ�� 5 ��ô�ͼ���
1+2+3+4+5=15����󷵻� 15��
*/
package demo06;

public class Mathematician {
	//1.���ֵ�ķ���
	public int max(int a,int b){
		int max=a>b?a:b;
		return max;
	} 
	//2.��λ���Ǽ��ķ���
	public int gws(int a){
		int gws=a%10;
		return gws;
	}
	//3.�����ķ���
	public int lifang(int a){
		int lf=a*a*a;
		return lf;
	}
	//4.����� 1 �ӵ��������ĺ��Ƕ��ٵķ���
	public int add(int a){
		int count=0;
			for(int i=1;i<=a;i++){
				count+=i;
			}
		return count;
	} 
}
