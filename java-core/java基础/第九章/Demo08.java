/*
1.8����һ��Ӣ�ĸ�����������ĸ˳��ӡ�A������Z�����У�������һ�������С���
��Ҫ����һ�׸����������飬�����ָ��������������С�Ч����ͼ:
*/
import java.util.*;
public class Demo08{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String[] arr = {"","Island","Ocean","Pretty","Sun"};
		System.out.print("����ǰ������Ϊ��");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		System.out.print("������������ƣ�");
		String music = input.next();
		int index = 0;
		boolean flag = false;
		//�ҳ��±�
		for(int i = 1;i<arr.length;i++){
			if(music.compareToIgnoreCase(arr[i])<0){
				flag = true;
				index = i-1;
				break;
			}	
		}
		if(!flag){
			index = arr.length;
		}
		//ǰ��
		for(int i = 0;i<index-1;i++){
			arr[i] = arr[i+1];
		}
		arr[index-1] = music;
		���
		System.out.print("����������Ϊ��");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}

	}
}