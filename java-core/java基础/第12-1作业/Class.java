import java.util.Scanner;


public class Class {
	String[] arr;
	public void add(int a){
		arr=new String[a];
		for(int i=0;i<arr.length;i++){
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入第"+(i+1)+"个学生的名字");
			String name=sc.next();
			arr[i]=name;
		}
	}

	public void found(String name){
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(name)) {
				System.out.print("请输入新名字");
				String a=sc.next();
				arr[i]=a;
				System.out.println("修改成功");
				return;
			}
		}
		System.out.print("查无此人");
	}
	public void show(){
		System.out.println("学生姓名列表");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Class a1=new Class();
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入学生人数");
		int num=sc.nextInt();
		a1.add(num);
		a1.show();
		System.out.println("请输入查找学生的名字");
		String c=sc.next();
		a1.found(c);
		a1.show();
	}
}
