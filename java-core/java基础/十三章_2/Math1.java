package 十三章_2;

public class Math1 {
	public int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public int max(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			max = max > arr[i] ? max : arr[i];
		}
		return max;
	}
}
