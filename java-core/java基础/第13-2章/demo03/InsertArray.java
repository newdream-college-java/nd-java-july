/*1.3、 编写程序，向整型数组的指定位置插入元素，输出插入前后数组的值
提示:方法 insertArray()定义如下:
public void insertArray(int [] arr,int index,int value){ }*/
package demo03;

public class InsertArray {
	public void insertArray(int [] arr,int index,int value){
		for (int i = 0; i < index; i++) {
			arr[i]=arr[i+1];
		}
		arr[index]=value;
	}
}
