import java.util.Scanner;


public class Class {
	String[] arr;
	public void add(int a){
		arr=new String[a];
		for(int i=0;i<arr.length;i++){
			Scanner sc=new Scanner(System.in);
			System.out.println("�������"+(i+1)+"��ѧ��������");
			String name=sc.next();
			arr[i]=name;
		}
	}

	public void found(String name){
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(name)) {
				System.out.print("������������");
				String a=sc.next();
				arr[i]=a;
				System.out.println("�޸ĳɹ�");
				return;
			}
		}
		System.out.print("���޴���");
	}
	public void show(){
		System.out.println("ѧ�������б�");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Class a1=new Class();
		Scanner sc=new Scanner(System.in);
		System.out.print("������ѧ������");
		int num=sc.nextInt();
		a1.add(num);
		a1.show();
		System.out.println("���������ѧ��������");
		String c=sc.next();
		a1.found(c);
		a1.show();
	}
}
