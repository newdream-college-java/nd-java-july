package 十三章_2;

public class Charu {

	/**
	 * @param args
	 */
	public static void insertArray(int[] arr, int index, int value) {
		for (int i = arr.length - 2; i >= index; i--) {
			arr[i + 1] = arr[i];
		}
		arr[index] = value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,2,3,4,5,0};
		insertArray(arr, 4, 6);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}

}
