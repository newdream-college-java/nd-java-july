package nine;

import java.util.Arrays;
import java.util.Scanner;

public class Work4 {

	/**
����һ����ϰ�еõ��������ַ������в���һ���µ��ַ���Ҫ�����֮���ַ�����
�Ա� ������ �޸���һ����Ŀ�Ĵ��룬���峤��Ϊ 9 �����飬����ԭ�ַ����� ����
һ�ⷽ��ʵ���ַ����������ҵ������ַ��Ĳ���λ�� �Ӳ���λ�ÿ�ʼ��Ԫ�ؾ���
��һ��λ�� �����µ��ַ�����������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a ={'a','d','s','f','w','q','e','r',' '};
		int index = 0;					//�����±�
		boolean flag = false;			//���ñ�ʶ
		Scanner sc = new Scanner(System.in);
		System.out.print("ԭ�ַ����У�");
		for(int i = 0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
		System.out.println();

		Arrays.sort(a);	
		System.out.print("���������У�");
		for(int i = 0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		System.out.print("������Ҫ������ַ�");
		char c = sc.next().charAt(0);
		for(int i = 0;i<a.length;i++){
			if(c<a[i]){					//�ҵ��˱�c��ģ�Ȼ��ȷ��λ��
				index = i-1;
				flag = true;
				System.out.println("Ҫ�����λ��"+i);
				break;

			}
		}
		if(!flag){
			System.out.println("û�ҵ���");
		}
		for (int i = 0; i < index; i++) {
			a[i] = a[i+1];
		}
		a[index]=c;
		for(int i = 0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}

	}

}
