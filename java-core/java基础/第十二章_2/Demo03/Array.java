package chapter12_2;

public class Array {
	public void insertArray(int arr[],int index,int value){
		//将该下标前的元素前移
		
		for (int i = 1; i <= index; i++) {
			arr[i-1] = arr[i];
		}
		arr[index] = value;
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		System.out.println("前："+arr[index-1]+",后："+arr[index+1]);
	}
}
