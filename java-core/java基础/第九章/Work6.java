package nine;

import java.util.Scanner;

public class Work6 {

	/**
	 * 1.6���Ӽ��������� 10 ���������Ϸ�ֵΪ 1��2��3�������� 3 ������Ϊ�Ƿ����֡�
	 *	���ͳ��ÿ�� �����ͷǷ����ֵĸ�����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] a = {1,2,3};
		int [] b = new int[10];
		int hf = 0;		//�Ϸ��ַ�����
		int ff = 0;		//�Ƿ��ַ�����
		for (int i = 0; i < b.length; i++) {
			System.out.print("�������"+(i+1)+"������:");
			b[i] = sc.nextInt();
		}

		for (int i = 0; i < b.length; i++) {
			int left = 0;
			int right = a.length-1;
			while (left<=right) {
				int middle = (left+right)/2;
				if(b[i]>a[middle]){
					left = middle+1;
				}else if (b[i]<a[middle]) {
					right = middle-1;
				}else {
					hf++;
					break;
				}
			}
			if(left>right){
				ff++;
			}
		}
		System.out.print("�Ϸ�����"+hf+"��\t�Ƿ�����"+ff+"��");
	}
}
