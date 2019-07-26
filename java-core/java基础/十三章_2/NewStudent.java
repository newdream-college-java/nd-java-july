package 十三章_2;

import java.util.*;

public class NewStudent {
	String name;
	int age;
	String sex;
	int sno;

	@Override
	public String toString() {
		return "NewStudent [age=" + age + ", name=" + name + ", sex=" + sex
				+ "]";
	}

	public void getName(int input) {
		if (input == sno) {
			System.out.println(name);
		} else {
			System.out.println("查无此人");
		}
	}

	public void getNSex(int input) {
		if (input == sno) {
			System.out.println(sex);
		} else {
			System.out.println("查无此人");
		}
	}

	public int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public int jiecheng(int n) {
		int sum = 1;
		for (int i = 1; i <= n; i++) {
			sum *= i;
		}
		return sum;
	}

	public boolean judge(int n) {
		boolean flag = true;
		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;

	}

	public int returnMin(int a, int b) {
		int n = a > b ? a : b;
		for (int i = n; i <= a * b; i++) {
			if (i % a == 0 && i % b == 0) {
				n = i;
				break;
			}
		}
		return n;
	}

	public int returnMax(int a, int b) {
		int n = a < b ? a : b;
		for (int i = n; i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				n = i;
				break;
			}
		}
		return n;
	}

	public int returnFeibo(int n) {
		int n1 = 1, n2 = 1;
		int re = 1;
		if (n >= 3) {
			for (int i = 3; i <= n; i++) {
				re = n1 + n2;
				n1 = n2;
				n2 = re;
			}
		} else {
			re = 1;
		}
		return re;
	}

	public void setName(int input, String newname) {
		if (input == sno) {
			name = newname;
		} else {
			System.out.println("查无此人");
		}
	}

	public void setSex(int input, String newsex) {
		if (input == sno) {
			sex = newsex;
		} else {
			System.out.println("查无此人");
		}
	}

	public int[] returnarr(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				int temp;
				if (arr[j] < arr[j - 1]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		return arr;
	}

}
