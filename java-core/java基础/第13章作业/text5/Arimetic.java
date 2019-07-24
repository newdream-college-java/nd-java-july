package job02.text5;

public class Arimetic {
	public int sumNum(int[] arr) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	public int maxNum(int[]arr) {
		int max=arr[0];
		for (int i = 1; i < arr.length; i++) {
			max=max>arr[i]?max:arr[i];
		}
		return max;
	}
}
