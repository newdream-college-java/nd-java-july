package Chapter09_array;

/*
	有一组英文歌曲，按照字母顺序从“A”到“Z”排列，保存在一个数组中。现
	在要增加一首歌曲插入数组，并保持歌曲名称升序排列。
*/
import java.util.*;

public class H {


	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String[] music={"Island","Ocean","Pretty","Sun"," "};
		System.out.print("插入前的数组为：");
		for (int  i= 0;  i< music.length; i++) {
			System.out.print(music[i]+" ");
		}
		System.out.println();
		System.out.print("请输入歌曲名称：");
		String m=input.next();
		int index=0;
		for (int i = 0; i < music.length; i++) {
			if(m.compareToIgnoreCase(music[i])<=0){
				index=i;
				break;
			}
		}
		if(m.compareToIgnoreCase(music[music.length-1])>0){
			index=music.length-1;
		}
		for (int i =music.length-1; i >index; i--) {
			music[i]=music[i-1];
		}
		music[index]=m;
		System.out.print("插入后的数组为：");
		for (int i = 0; i < music.length; i++) {
			System.out.print(music[i]+" ");
		}
	}

}
