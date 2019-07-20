/*将数组中所有奇数，复制到另一个数组，要求另一个数组大小不能大也不能小
然后输出另一个数组的值
int[] arr = {1,2,3,4,5,6,7};
枚举
brr[0]=arr[0]
brr[1]=arr[2];
brr[2]=arr[4]
brr[3]=arr[6]

*/
public class Demo01{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7};
		//1.统计arr数组的奇数的个数
		int count = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==1){
				count++;
			}
		}
		//2.定义另一个数组？ 大小=奇数个数？
		int[] brr = new int[count];
		//3.将arr数组所有的奇数复制到brr数组
		int j= 0;//表示brr数组的下标
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==1){
				brr[j] = arr[i];
				j++;
			}

		}
		//4.输出
		for(int i=0;i<brr.length;i++){
			System.out.print(brr[i]+"\t");
		}


	}
}




