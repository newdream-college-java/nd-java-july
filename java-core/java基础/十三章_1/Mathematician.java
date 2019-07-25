package 十三章_1;

public class Mathematician {
	public int max(int a, int b) {
		int max = 0;
		max = a > b ? a : b;
		return max;
	}

	public int t1(int a) {
		int n = a % 10;
		return n;
	}

	public int t2(int a) {
		return a * a * a;
	}

	public int t3(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
}
