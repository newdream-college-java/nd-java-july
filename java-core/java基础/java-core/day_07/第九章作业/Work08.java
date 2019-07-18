/*1.8、有一组英文歌曲，按照字母顺序从“A”到“Z”排列，保存在一个数组中。现在要增加一首歌曲插入数组，并保持歌曲名称升序排列。效果如图*/
import java.util.*;
import java.lang.*;
public class Work08{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String[] s={"","Island","Ocean","Pretty","Sun"};
		System.out.print("插入前的数组为：");
		for(int i=0;i<s.length;i++){
			System.out.print(s[i]+"\t");
		}
		System.out.println();
		System.out.print("请输入歌曲名称：");
		int index=0;
		int i=1;
		String c=in.next();
		for(;i<s.length;i++){
			if(s[i].compareToIgnoreCase(c)>=0){
				index=i-1;
				break;
			}
		}
		if(i==s.length){
			index=s.length-1;
		}
		for(int j=0;j<index;j++){
			s[j]=s[j+1];
		}
		//插入元素
		s[index]=c;
		for(int k=0;k<s.length;k++){
			System.out.print(s[k]+"\t");
		}
		
	}
}
