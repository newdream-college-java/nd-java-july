/*1.7��������һ������Ϊ 5 ������ int [] array = new int[]{1,3,-1,5,-2}�ִ���
һ �������� newArray[]��Ҫ����������Ԫ�صĴ��˳����ԭ�����Ԫ�����򣬲�
�����ԭ���� ��Ԫ��ֵС�� 0�����������а� 0 �洢������������������*/
public class Demo07{
	public static void main(String [] args){
		int [] array ={1,3,-1,5,-2};
		int [] Array=new int[5];
		int j=4;
		for(int i=0;i<5;i++){
			if(array[i]<0){
				Array[j]=0;
			}else{
				Array[j]=array[i];
			}
			j--;
		}
		System.out.print("ԭ��������Ϊ��");
		for(int i=0;i<5;i++){
			System.out.print(array[i]+" \t");
		}
		System.out.println("");
		System.out.print("����������Ϊ��");
		for(int i=0;i<5;i++){
			System.out.print(Array[i]+" \t");
		}
	}	
}