package nine;

public class Work7 {

	/**
	 * 1.7��������һ������Ϊ 5 ������ int [] array = new int[]{1,3,-1,5,-2}�ִ���
		һ �������� newArray[]��Ҫ����������Ԫ�صĴ��˳����ԭ�����Ԫ�����򣬲�
		�����ԭ���� ��Ԫ��ֵС�� 0�����������а� 0 �洢������������������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int[]{1,3,-1,5,-2};
		int [] newArray = new int[5];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[array.length-i-1];
		}
		for (int i = 0; i < newArray.length; i++) {
			if (newArray[i]<0) {
				newArray[i]=0;
			}
		}
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i]+"\t");
		}

	}

}
