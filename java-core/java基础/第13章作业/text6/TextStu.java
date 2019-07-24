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
			System.out.println("请选择：1.自我介绍 2.获取姓名 3.设置姓名 4.获取性别 5.设置性别 "
					+ "6.数组和 7.整数积 8.判断质数 9.最小公倍数 10.最大公约数 11.斐波拉契数 12.数组排序 13.鸡鸭");
			int ans = scanner.nextInt();
			answer(ans);
			if(ans==999) {
				System.out.println("程序结束!");
				break;
			}
		}
	}
	
	public static void answer(int ans) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		switch (ans) {
		case 1:
			System.out.print("请输入姓名：");
			student.name = scanner.next();
			System.out.print("请输入年龄：");
			student.age = scanner.nextInt();
			System.out.print("请输入性别：");
			student.sex = scanner.next();
			System.out.println("自我介绍：");
			System.out.println(student.toString());
			break;
		case 2:
			System.out.println("姓名：" + student.getName());
			break;
		case 3:
			System.out.println("姓名：" + student.settingName());
			break;
		case 4:
			System.out.println("性别：" + student.getSex());
			break;
		case 5:
			System.out.println("性别：" + student.settingSex());
			break;
		case 6:
			System.out.print("请设置数组长度：");
			int n = scanner.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				System.out.print("请输入第" + (i + 1) + "个元素：");
				arr[i] = scanner.nextInt();
			}
			System.out.println("数组和为：" + student.sumArr(arr));
			break;
		case 7:
			System.out.print("请输入一个整数：");
			int n1 = scanner.nextInt();
			System.out.println(n1 + "的阶乘为：" + student.numJi(n1));
			break;
		case 8:
			System.out.print("请输入一个整数：");
			int n2 = scanner.nextInt();
			System.out.println(n2 + "是否为质数：（true/false）" + student.isZhi(n2));
			break;
		case 9:
			System.out.print("请输入第一个整数：");
			int a = scanner.nextInt();
			System.out.print("请输入第二个整数：");
			int b = scanner.nextInt();
			System.out.println("最小公倍数：" + student.minGbs(a, b));
			break;
		case 10:
			System.out.print("请输入第一个整数：");
			int a1 = scanner.nextInt();
			System.out.print("请输入第二个整数：");
			int b1 = scanner.nextInt();
			System.out.println("最大公约数：" + student.maxGys(a1, b1));
			break;
		case 11:
			System.out.print("请输入一个整数：");
			int n3 = scanner.nextInt();
			System.out.println("第" + n3 + "个斐波拉契数为：" + student.fib(n3));
			break;
		case 12:
			System.out.print("请设置数组长度：");
			int n4 = scanner.nextInt();
			String[] arr1 = new String[n4];
			for (int i = 0; i < arr1.length; i++) {
				System.out.print("请输入第" + (i + 1) + "个元素：");
				arr1[i] = scanner.next();
			}
			String brr[]=student.sortArr(arr1);
			System.out.println("排序后的数组为：");
			for (int i = 0; i < arr1.length; i++) {
				System.out.print(brr[i]+"\t");
			}
			System.out.println();
			
			break;
		case 13:
			System.out.println("请输入鸡或者鸭：");
			String ani = scanner.next();
			System.out.println("输出的是：" + student.getAnimal(ani));
			break;
		default:
			System.out.println("输入无效！");
			break;
		}
	}
}
