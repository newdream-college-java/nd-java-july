/*1.7��������һ������Ϊ 5 ������ int [] array = new int[]{1,3,-1,5,-2}�ִ���
һ �������� newArray[]��Ҫ����������Ԫ�صĴ��˳����ԭ�����Ԫ�����򣬲�
�����ԭ���� ��Ԫ��ֵС�� 0�����������а� 0 �洢������������������*/
public class Array7 {
	public static void main(String[] args){
		int [] array = new int[]{1,3,-1,5,-2};
		int [] newArray=new int[5];
		System.out.print("ԭ����Ԫ�أ�");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"\t");
			if (array[i]<0) {
				array[i]=0;
			}
			newArray[newArray.length-i-1]=array[i];
		}
		System.out.println();
		System.out.print("������Ԫ�أ�");
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i]+"\t");
		}
	}
}