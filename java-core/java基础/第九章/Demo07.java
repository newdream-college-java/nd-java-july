/*
1.7��������һ������Ϊ 5 ������ int [] array = new int[]{1,3,-1,5,-2}�ִ���
һ �������� newArray[]��Ҫ����������Ԫ�صĴ��˳����ԭ�����Ԫ�����򣬲�
�����ԭ���� ��Ԫ��ֵС�� 0�����������а� 0 �洢������������������
*/
public class Demo07{
	public static void main(String[] args){
		int[] arr = {1,3,-1,5,-2};
		int[] Arr = new int[5];
		System.out.print("ԭ����Ϊ��");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i = 4;i>=0;i--){
			for(int j = 0;j<Arr.length;j++){
				if(arr[i]>0){
					Arr[j] = arr[i];
					break ;
				}else{
					Arr[j] = 0;
					break ;
				}
			}
		} 
		System.out.print("�µ�����Ϊ��");
		for(int i = 0;i<Arr.length;i++){
			System.out.print(Arr[i]+" ");
		}
	}
}