import java.util.Arrays;
import java.util.Scanner;


/*将一组乱序的字符进行升序排序 创建数组存储原字符序列
利用 Array 类的 sort( )方法对数组进行排序，并循环输出 从最后一个元素开始，
将数组中的元素逆序输出*/
public class Demo03 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入数组长度：");
		int n=input.nextInt();
		char zf[]=new char[n];
		for(int i=0;i<zf.length;i++){
			System.out.print("请输入第"+(i+1)+"个人字符：");
			zf[i]=input.next().charAt(0);
		}
		System.out.print("原字符序列：");
		for(int i=0;i<zf.length;i++){
			System.out.print(zf[i]+"\t");
		}
		System.out.println();
		Arrays.sort(zf);
		System.out.print("升序排序后：");
		for(int i=0;i<zf.length;i++){
			System.out.print(zf[i]+"\t");
		}
		System.out.println();
		System.out.print("逆序输出为：");
		for(int i=0;i<zf.length/2;i++){
			char temp=zf[i];
			zf[i]=zf[zf.length-i-1];
			zf[zf.length-i-1]=temp;
		}
		for(int i=0;i<zf.length;i++){
			System.out.print(zf[i]+"\t");
		}
	}
}
