import java.util.Scanner;

/*1.8、有一组英文歌曲，按照字母顺序从“A”到“Z”排列，保存在一个数组中。现
在要增加一首歌曲插入数组，并保持歌曲名称升序排列。效果如图:*/
public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String[] song={" ","Island","Ocean","Pretty","Sun"};
		System.out.print("请输入歌曲名称：");
		String music=input.next();
		int index=0;
		System.out.print("插入前歌曲为：");
		for (int i = 1; i < song.length; i++) {
			System.out.print(song[i]+" ");
			if (music.compareToIgnoreCase(song[i])<0) {
				index=i-1;
				break;
			}
			if (music.compareToIgnoreCase(song[song.length-1])>=0) {
				index=song.length-1;
			}
		}
		System.out.println();
		for (int i = 0; i < index; i++) {
			song[i]=song[i+1];
		}
		song[index]=music;
		System.out.print("插入后歌曲为：");
		for (int i = 0; i < song.length; i++) {
			System.out.print(song[i]+" ");
		}
	}

}
