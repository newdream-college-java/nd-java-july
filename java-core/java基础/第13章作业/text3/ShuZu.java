package job02.text3;

/*编写程序，向整型数组的指定位置插入元素，输出插入前后数组的值
提示:方法 insertArray()定义如下:
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
