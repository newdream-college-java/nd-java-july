import java.util.Scanner;
import java.util.Arrays;
public class H{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		String[] a = {"Island","Ocean","Pretty","Sun"," "};
		System.out.print("插入前的数组为：");
		for(int i=0;i<a.length;i++){
		System.out.print(a[i]+"\t");
		}
		System.out.println();
		System.out.print("请输入要插入的歌名：");
		String b = input.next();
		int index=0;
		for(int i=0;i<a.length-1;i++){
		if(a[i].compareToIgnoreCase(b)>0){
		index=i;
		break;
		}
		}
		for(int i=a.length-1;i>index;i--){
		a[i]=a[i-1];
		}
		a[index]=b;
		System.out.print("插入后的数组为：");
		for(int i=0;i<a.length;i++){
		System.out.print(a[i]+"\t");
		}
}
}