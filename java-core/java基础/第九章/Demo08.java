/*
有一组英文歌曲，按照字母顺序从“A”到“Z”排列，保存在一个数组中。现
在要增加一首歌曲插入数组，并保持歌曲名称升序排列。
*/
import java.util.*;
public class Demo08{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String[] musicName={"Island","Ocean","Pretty","Sun"," "};
		System.out.print("插入前的数组为：");
		for (int  i= 0;  i< musicName.length; i++) {
			System.out.print(musicName[i]+" ");
		}
		System.out.println();
		System.out.print("请输入歌曲名称：");
		String name=input.next();
		int index=0;
		for (int i = 0; i < musicName.length-1; i++) {
			if(name.compareToIgnoreCase(musicName[i])<=0){
				index=i;
				break;
			}
		}
		if(name.compareToIgnoreCase(musicName[musicName.length-2])>0){
			index=musicName.length-1;
		}
		for (int i =musicName.length-1; i >index; i--) {
			musicName[i]=musicName[i-1];
		}
		musicName[index]=name;
		System.out.print("插入后的数组为：");
		for (int i = 0; i < musicName.length; i++) {
			System.out.print(musicName[i]+" ");
		}
	}
}