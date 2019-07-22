/*1.8、有一组英文歌曲，按照字母顺序从“A”到“Z”排列，保存在一个数组中。现
在要增加一首歌曲插入数组，并保持歌曲名称升序排列。*/
import java.util.*;
public class Demo08{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		String [] music={"","Island","Ocean","Pretty","Sun"};
		System.out.print("插入前的数组为：");
		for(int i=1;i<=4;i++){
			System.out.print(music[i]+"  ");
		}
		System.out.println("");
		System.out.print("请输入歌曲的名称:");
		music[0]=input.next();
		String tmp="";
		for(int i=0;i<4;i++){
			if(music[i].compareToIgnoreCase(music[i+1])>0){
				tmp=music[i];
				music[i]=music[i+1];
				music[i+1]=tmp;
			}
		}
		System.out.print("插入后的数组为：");
		for(int i=0;i<=4;i++){
			System.out.print(music[i]+"  ");
		}
	}	
}