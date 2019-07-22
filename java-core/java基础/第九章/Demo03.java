/*
1.3、需求说明		
将一组乱序的字符进行升序排序 创建数组存储原字符序列  
利用 Array 类的 sort( )方法对数组进行排序，并循环输出 从最后一个元素开始，
将数组中的元素逆序输出 
*/
import java.util.*;
public class Demo03{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入数组长度:");
		int l= input.nextInt();
		char [] a =new char[l];
		for(int i =0;i<l;i++){
			System.out.print("请输入第"+(i+1)+"个字符为：");
			a[i]=input.next().charAt(0);
		}
		System.out.print("原字符序列：");
		for(int i =0;i<l;i++){
			System.out.print(a[i]+" ");
		}
		Arrays.sort(a);
		System.out.print("\n升序排序后：");
		for(int i =0;i<l;i++){
			System.out.print(a[i]+" ");
		}
		System.out.print("\n逆序输出为：");
		for(int i =(l-1);i>=0;i--){
			System.out.print(a[i]+" ");
		}
	}
}