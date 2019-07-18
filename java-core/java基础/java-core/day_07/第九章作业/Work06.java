/*1.6、从键盘上输入 10 个整数，合法值为 1、2、3。不是这 3 个数则为非法数字。编程统计每个 整数和非法数字的个数。*/
import java.util.*;
public class Work06{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int[] a=new int[10];
		int h=0,f=0;
		for(int i=0;i<a.length;i++){
			System.out.print("请输入第"+(i+1)+"个整数：");
			a[i]=in.nextInt();
			if(a[i]==1||a[i]==2||a[i]==3){
				h++;
			}else {
				f++;
			}
		}
		System.out.println("合法数字有："+h+"个\n"+"非法数字有"+f+"个");
	}
}
