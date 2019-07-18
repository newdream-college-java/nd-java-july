/*1.3将一组乱序的字符进行升序排序 创建数组存储原字符序列利用 Array 类的 sort( )方法对数组进行排序，并循环输出 从最后一个元素开始，将数组中的元素逆序输出*/
import java.util.Arrays;
public class Work03{
	public static void main(String [] args){
		char[] c={'a','c','u','b','e','p','f','z'};
		System.out.print("原字符序列：");
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+"\t");
		}
		System.out.println();
		Arrays.sort(c);
		System.out.print("升序排序后：");
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+"\t");
		}
		System.out.println();
		System.out.print("逆序输出为：");
		for(int i=c.length-1;i>=0;i--){
			System.out.print(c[i]+"\t");
		}
		
	}
}