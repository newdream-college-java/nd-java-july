/**
 * 1.3�� ��д���������������ָ��λ�ò���Ԫ�أ��������ǰ�������ֵ
��ʾ:���� insertArray()��������:
public void insertArray(int [] arr,int index,int value){ }
 * @author 54975
 *
 */
public class ArraysClass {
	public void insertArray(int[] arr,int index,int value){
		for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
		}
		System.out.println();
		/**
		 * ������
		 */
		for(int i=arr.length-1;i>=index;i--){
			arr[i]=arr[i-1];
			
		}
		arr[index]=value;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
	}
	}
}
