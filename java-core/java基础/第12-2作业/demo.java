
public class demo {
	public void insertArray(int [] arr,int index,int value){
		for(int i=index;i<arr.length-1;i++){
			arr[i+1]=arr[i];
		}
		arr[index]=value;
		
	}

}
