/*1.3�� ��д���������������ָ��λ�ò���Ԫ�أ��������ǰ�������ֵ
��ʾ:���� insertArray()��������:
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
