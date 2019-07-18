/*升序数组：0 60 63 82 85 99
插入的数：70
*/
import java.util.Arrays;
public class Demo06{
	public static void main(String[] args){
		int[] arr = {2,33,1,99,77,66};
		//排序工具类    只能升序
		Arrays.sort(arr);

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}

	}
}