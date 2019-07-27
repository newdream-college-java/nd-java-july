package chapter12_2;

public class MathMan {
	public int getSum(int[] arr){
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public int getMax(int[] arr){
		int max = arr[0];
		for (int i = 0; i < arr.length-1; i++) {
			max = arr[i]>arr[i+1]?arr[i]:arr[i+1];
		}
		return max;
	}
}
