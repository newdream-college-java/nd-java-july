package chapter_13_2;
/*1.3�� ��д���������������ָ��λ�ò���Ԫ�أ��������ǰ�������ֵ��ʾ:���� insertArray()��������:
public void insertArray(int [] arr,int index,int value){ }*/
public class CharuArray {
	public void insertArray(int [] arr,int index,int value){ 
		System.out.println("����ǰ������Ϊ��");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		System.out.println("����������Ϊ��");
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
