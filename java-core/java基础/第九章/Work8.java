package nine;

import java.util.Scanner;

public class Work8 {

	/**
	 *	1.8����һ��Ӣ�ĸ�����������ĸ˳��ӡ�A������Z�����У�������һ�������С���
	 *	��Ҫ����һ�׸����������飬�����ָ��������������С�
	 *  ��ʾ������ʹ���ַ����� compareToIgnoreCase()������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] eng = {"Islan","Ocean","Pretty","Sun",""};
		System.out.print("�������������");
		String string = scanner.next();
		//���ҵ������λ��
		int index = 0;//�����ڵ�0���±�
		for (int i = 0; i < eng.length; i++) {
			if (string.compareToIgnoreCase(eng[i])<=0) {
				index = i;
				System.out.println("�±�"+index);
				break;
			}
		}
		for (int i = eng.length-1; i > index; i--) {
			eng[i]=eng[i-1];
		}
		eng[index]=string;
		for (int i = 0; i < eng.length; i++) {
			System.out.print(eng[i]+"\t");
		}
	}

}
