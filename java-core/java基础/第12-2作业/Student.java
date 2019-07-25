public class Student {
	double javaScore;
	double cScore;
	double sqlScore;
	String name;
	int age;
	String sex;

	public double getAvg(Student stu) {
		double sum = stu.cScore + stu.javaScore + stu.sqlScore;
		return sum / 3;
	}

	public String toString(Student stu) {
		return stu.name + stu.age + stu.sex;
	}

	public String getName(Student stu) {
		return stu.name;
	}

	public void changeName(Student stu, String a) {
		stu.name = a;
	}

	public String getSex(Student stu) {
		return stu.sex;
	}

	public void changeSex(Student stu, String a) {
		stu.sex = a;
	}

	public int sum(int[] a) {
		int b = 0;
		for (int i = 0; i < a.length; i++) {
			b += a[i];
		}
		return b;
	}

	public int lc(int n) {
		int a = 1;
		for (int i = 1; i <= n; i++) {
			a = a * i;
		}
		return a;
	}

	public boolean panduan(int n) {
		boolean flag = true;
		for (int i = 2; i <= n; i++) {
			if (n % 2 == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public int gys(int a, int b) {
		int c = 1;
		for (int i = 1; i <= (a > b ? a : b); i++) {
			if (a % i == 0 && b % i == 0) {
				c = i;
			}
		}
		return c;
	}

	public int gbs(int a, int b) {
		int c = a > b ? a : b;
		for (int i = (a > b ? a : b); i <= a * b; i++) {
			if (i % a == 0 && i % b == 0) {
				c = i;
			}
		}
		return c;
	}

	public int fblq(int n) {
		int a = 1;
		int b = 1;
		int sum = 0;
		if (n >= 3) {
			for (int i = 3; i <= n; i++) {
				sum = a + b;
				a = b;
				b = sum;
			}
		}else{
			sum=1;
		}
		return sum;
	}

	public String jy(String a) {
		String b = "";
		if (a.equals("¼¦")) {
			b = "Ñ¼";
		}
		return b;
	}
}
