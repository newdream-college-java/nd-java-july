package chapter_13_2;
/*1.4��дһ����ѧ�ҵ��࣬�����д������ķ�������: 
a)����һ�����ε����飬����������������е���������֮�͵ķ�����
b)����һ�����ε����飬����������������е����ֵ�ķ���*/
public class Mather {
	public int sum(int [] a){
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	public int max(int [] b){
		int max=b[1];
		for (int i = 1; i < b.length; i++) {
			if(max<b[i]){
				max=b[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Mather m=new Mather();
		int[] arr={1,3,5,7,9,6,8};
		System.out.println("����ĺ�Ϊ��"+m.sum(arr));
		System.out.println("��������ֵ�ǣ�"+m.max(arr));
	}

}
