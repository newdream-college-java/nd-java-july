package work;

import java.util.Scanner;


/**
 * 1.3������˵��
		�޸�ѧ�������������¡��������������޸Ĳ���ʾ�Ƿ��޸ĳɹ�
 */
public class Students {
	public void creatInFo(int a) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[a];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("������ͻ������֣�");
			arr[i] = sc.next();
		}
		show(arr);
		
		System.out.print("\n������Ҫ�޸ĵ�ѧ��������");
		String c = sc.next();
		System.out.print("�������µ�ѧ��������");
		String b = sc.next();
		changeInfo(c, b, arr);
		
	}
	public void changeInfo(String c,String b,String arr[]) {
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (c.equals(arr[i])) {
				arr[i]=b;
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("\n�Բ���û�����");
		}else {
			System.out.println("\n�ҵ����޸ĳɹ�����");
		}
		
		show(arr);
	}
	public void show(String arr[]) {
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
		Students students = new Students();
		students.creatInFo(5);
	}

}
