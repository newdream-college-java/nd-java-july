package work;

import java.util.Scanner;

/**
 * 1.1������˵��
	�����ͻ�ҵ���� CustomerBiz,ʵ�ֿͻ���������Ӻ���ʾ����ͼ
 */
public class CustomerBiz {
	
	public void customer(int a){
		String[] arr = new String[a];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("������ͻ������֣�");
			arr[i] = sc.next();
			//System.out.println("����������(y/n)");
			//String a = sc.next();
			//if (a.equals("n")) {
			//	break;
			//}
		}
		System.out.println("***************************");
		System.out.println("\t�ͻ������б�");
		System.out.println("****************************");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=null) {
				System.out.print(arr[i]+"\t");			
			}
		}
		
	}

	public static void main(String[] args) {
		CustomerBiz customerBiz = new CustomerBiz();
		customerBiz.customer(3);

	}

}
