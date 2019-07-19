public class G{
	public static void main(String [] args){
		int[] array = new int[]{1,3,-1,5,-2};
		int[] newArray = new int[5];
		int c=array.length-1;
		for(int i=0;i<array.length;i++){
			
		if(array[c]<0){
		newArray[i]=0;
		}else {
		newArray[i]=array[c];
		}
		c--;
		}
		System.out.print("新的数组数据位：");
		for(int i=0;i<array.length;i++){
		System.out.print(newArray[i]+"\t");
		}
}
}