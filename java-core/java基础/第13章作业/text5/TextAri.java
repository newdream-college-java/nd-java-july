package job02.text5;

import java.util.Scanner;

public class TextAri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Arimetic ari=new Arimetic();
		System.out.print("���������鳤�ȣ�");
		int n=input.nextInt();
		int[]arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�������"+(i+1)+"��Ԫ�أ�");
			arr[i]=input.nextInt();
		}
		
		System.out.println("�����Ϊ��"+ari.sumNum(arr));
		System.out.println("�������ֵΪ��"+ari.maxNum(arr));
	}

}
