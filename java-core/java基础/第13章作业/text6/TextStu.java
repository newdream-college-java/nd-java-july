package job02.text6;

import java.util.Scanner;

public class TextStu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xuanZe();
	}

	public static void xuanZe() {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		for (int j = 1;; j++) {
			System.out.println("��ѡ��1.���ҽ��� 2.��ȡ���� 3.�������� 4.��ȡ�Ա� 5.�����Ա� "
					+ "6.����� 7.������ 8.�ж����� 9.��С������ 10.���Լ�� 11.쳲������� 12.�������� 13.��Ѽ");
			int ans = scanner.nextInt();
			answer(ans);
			if(ans==999) {
				System.out.println("�������!");
				break;
			}
		}
	}
	
	public static void answer(int ans) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		switch (ans) {
		case 1:
			System.out.print("������������");
			student.name = scanner.next();
			System.out.print("���������䣺");
			student.age = scanner.nextInt();
			System.out.print("�������Ա�");
			student.sex = scanner.next();
			System.out.println("���ҽ��ܣ�");
			System.out.println(student.toString());
			break;
		case 2:
			System.out.println("������" + student.getName());
			break;
		case 3:
			System.out.println("������" + student.settingName());
			break;
		case 4:
			System.out.println("�Ա�" + student.getSex());
			break;
		case 5:
			System.out.println("�Ա�" + student.settingSex());
			break;
		case 6:
			System.out.print("���������鳤�ȣ�");
			int n = scanner.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				System.out.print("�������" + (i + 1) + "��Ԫ�أ�");
				arr[i] = scanner.nextInt();
			}
			System.out.println("�����Ϊ��" + student.sumArr(arr));
			break;
		case 7:
			System.out.print("������һ��������");
			int n1 = scanner.nextInt();
			System.out.println(n1 + "�Ľ׳�Ϊ��" + student.numJi(n1));
			break;
		case 8:
			System.out.print("������һ��������");
			int n2 = scanner.nextInt();
			System.out.println(n2 + "�Ƿ�Ϊ��������true/false��" + student.isZhi(n2));
			break;
		case 9:
			System.out.print("�������һ��������");
			int a = scanner.nextInt();
			System.out.print("������ڶ���������");
			int b = scanner.nextInt();
			System.out.println("��С��������" + student.minGbs(a, b));
			break;
		case 10:
			System.out.print("�������һ��������");
			int a1 = scanner.nextInt();
			System.out.print("������ڶ���������");
			int b1 = scanner.nextInt();
			System.out.println("���Լ����" + student.maxGys(a1, b1));
			break;
		case 11:
			System.out.print("������һ��������");
			int n3 = scanner.nextInt();
			System.out.println("��" + n3 + "��쳲�������Ϊ��" + student.fib(n3));
			break;
		case 12:
			System.out.print("���������鳤�ȣ�");
			int n4 = scanner.nextInt();
			String[] arr1 = new String[n4];
			for (int i = 0; i < arr1.length; i++) {
				System.out.print("�������" + (i + 1) + "��Ԫ�أ�");
				arr1[i] = scanner.next();
			}
			String brr[]=student.sortArr(arr1);
			System.out.println("����������Ϊ��");
			for (int i = 0; i < arr1.length; i++) {
				System.out.print(brr[i]+"\t");
			}
			System.out.println();
			
			break;
		case 13:
			System.out.println("�����뼦����Ѽ��");
			String ani = scanner.next();
			System.out.println("������ǣ�" + student.getAnimal(ani));
			break;
		default:
			System.out.println("������Ч��");
			break;
		}
	}
}
