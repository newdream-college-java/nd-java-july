import java.util.Scanner;



/*
 ������һ������Ϊ 5 ������ int [] array = new int[]{1,3,-1,5,-2}�ִ���
һ �������� newArray[]��Ҫ����������Ԫ�صĴ��˳����ԭ�����Ԫ�����򣬲�
�����ԭ���� ��Ԫ��ֵС�� 0�����������а� 0 �洢������������������
 */
public class Demo07 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("���������鳤�ȣ�");
		int n=input.nextInt();
		int[] array=new int[n];
		int[] newArray=new int[n];
		for(int i=0;i<array.length;i++){
			System.out.print("�������"+(i+1)+"������");
			array[i]=input.nextInt();
		}
		for(int i=0;i<array.length;i++){
			if(array[array.length-1-i]>=0){
				newArray[i]=array[array.length-1-i];
			}else{
				newArray[i]=0;
			}
			System.out.print(newArray[i]+"\t");
		}
	}
}
