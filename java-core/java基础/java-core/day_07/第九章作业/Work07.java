/*1.7��������һ������Ϊ 5 ������ int [] array = new int[]{1,3,-1,5,-2}�ִ���һ �������� newArray[]��Ҫ����������Ԫ�صĴ��˳����ԭ�����Ԫ�����򣬲������ԭ���� ��Ԫ��ֵС�� 0�����������а� 0 �洢������������������*/
import java.util.*;
public class Work07{
	public static void main(String[] args){
		int [] array={1,3,-1,5,-2};
		int [] newArray=new int[5];
		for(int i=0;i<array.length;i++){
			if(array[i]<0){
				array[i]=0;
			}
		}
		newArray=array;
		for(int i=array.length-1;i>=0;i--){
			System.out.print(array[i]+"\t");
		}
	}
}
