/*
1.8、有一组英文歌曲，按照字母顺序从“A”到“Z”排列，保存在一个数组中。现
在要增加一首歌曲插入数组，并保持歌曲名称升序排列。效果如图:
*/
import java.util.*;
public class Demo08{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String[] arr = {"","Island","Ocean","Pretty","Sun"};
		System.out.print("插入前的数组为：");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		System.out.print("请输入歌曲名称：");
		String music = input.next();
		int index = 0;
		boolean flag = false;
		//找出下标
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
		//前移
		for(int i = 0;i<index-1;i++){
			arr[i] = arr[i+1];
		}
		arr[index-1] = music;
		输出
		System.out.print("插入后的数组为：");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}

	}
}