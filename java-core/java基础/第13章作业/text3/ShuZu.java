package job02.text3;

/*��д���������������ָ��λ�ò���Ԫ�أ��������ǰ�������ֵ
��ʾ:���� insertArray()��������:
public void insertArray(int [] arr,int index,int value){ }*/
public class ShuZu {
	public int[] insertArray(int[]arr,int index,int value) {
		if(index==arr.length-1) {
			arr[index]=value;
		}else {	
			for(int i=index;i<arr.length-1;i++) {
				arr[i+1]=arr[i];
			}
			arr[index]=value;
		}
		return arr;
	}
	
	public void show(int[]arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
}
