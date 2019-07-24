package chapter_13_2;
/*1.3、 编写程序，向整型数组的指定位置插入元素，输出插入前后数组的值提示:方法 insertArray()定义如下:
public void insertArray(int [] arr,int index,int value){ }*/
public class CharuArray {
	public void insertArray(int [] arr,int index,int value){ 
		System.out.println("插入前的数组为：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		System.out.println("插入后的数组为：");
		for (int i = 0; i < arr.length; i++) {
			if(i==index){
				System.out.print(value+"\t");
			}
			System.out.print(arr[i]+"\t");
		}
	}
	public static void main(String[] args) {
		CharuArray c = new CharuArray();
		int[] oldArr={4,5,6,7,9,10};
		c.insertArray(oldArr, 4, 8);
	}

}
