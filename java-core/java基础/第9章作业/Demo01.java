/*
�����ؼ���Ʒ���飬�洢 5 ����Ʒ���ƣ�����̨��ʾ�ؼ���Ʒ����
*/
import java.util.*;
public  class Demo01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String arr[]=new String[5];
		for(int i=0;i<arr.length;i++){
			System.out.print("�������"+(i+1)+"����Ʒ���ƣ�");
			arr[i]=input.next();
		}
		System.out.println("���λ�ؼ���Ʒ�У�");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}