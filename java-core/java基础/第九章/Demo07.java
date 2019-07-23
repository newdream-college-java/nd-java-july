/*
1.7、假设有一个长度为 5 的数组 int [] array = new int[]{1,3,-1,5,-2}现创建
一 个新数组 newArray[]，要求新数组中元素的存放顺序与原数组的元素逆序，并
且如果原数组 的元素值小于 0，在新数组中按 0 存储。编程输出新数组数据
*/
public class Demo07{
	public static void main(String[] args){
		int[] arr = {1,3,-1,5,-2};
		int[] Arr = new int[5];
		System.out.print("原数组为：");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i = 4;i>=0;i--){
			for(int j = 0;j<Arr.length;j++){
				if(arr[i]>0){
					Arr[j] = arr[i];
					break ;
				}else{
					Arr[j] = 0;
					break ;
				}
			}
		} 
		System.out.print("新的数组为：");
		for(int i = 0;i<Arr.length;i++){
			System.out.print(Arr[i]+" ");
		}
	}
}