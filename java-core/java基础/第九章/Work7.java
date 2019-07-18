package nine;

public class Work7 {

	/**
	 * 1.7、假设有一个长度为 5 的数组 int [] array = new int[]{1,3,-1,5,-2}现创建
		一 个新数组 newArray[]，要求新数组中元素的存放顺序与原数组的元素逆序，并
		且如果原数组 的元素值小于 0，在新数组中按 0 存储。编程输出新数组数据
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int[]{1,3,-1,5,-2};
		int [] newArray = new int[5];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[array.length-i-1];
		}
		for (int i = 0; i < newArray.length; i++) {
			if (newArray[i]<0) {
				newArray[i]=0;
			}
		}
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i]+"\t");
		}

	}

}
