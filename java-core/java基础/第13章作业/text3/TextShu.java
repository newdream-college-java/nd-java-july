package job02.text3;

import java.util.Scanner;

public class TextShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		ShuZu shu=new ShuZu();
		System.out.print("���������鳤�ȣ�");
		int n=scanner.nextInt();
		int []arr=new int[n];
		System.out.println("���������������");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�������"+(i+1)+"������");
			arr[i]=scanner.nextInt();
		}
		System.out.print("������Ҫ�����������±�ţ�");
		int index=scanner.nextInt();
		System.out.print("������Ҫ��������ݣ�");
		int value=scanner.nextInt();
		System.out.println("��������֮ǰ������Ϊ��");
		shu.show(arr);
		System.out.println("��������֮�������Ϊ��");
		shu.insertArray(arr, index, value);
		shu.show(arr);
	}

}
