/*插入排序*/
public class Demo04{
	public static void main(String[] args){
		int[] arr = {8,4,2,1,23,344,12};
		int tmp;
		int j ;
		for(int i=1;i<arr.length;i++){//i表示论述
			j=i
			while(j>0){
				if(arr[j]>arr[j-1]){
					//插入
					tmp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=tmp;
				}else{
					//停止插入
					break;
				}
				j--;
			}
		}
		//输出排序后的数组
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
}