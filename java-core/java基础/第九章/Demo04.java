/*向上一个练习中得到的升序字符序列中插入一个新的字符，要求插入之后字符序列
仍保 持有序 修改上一个题目的代码，定义长度为 9 的数组，保存原字符序列 按上
一题方法实现字符序列排序找到新增字符的插入位置 从插入位置开始的元素均后
移一个位置 插入新的字符，并输出结果*/
import java.util.*;
public class Demo04{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		char[]a={'0','a','c','u','b','e','p','f','z'};
		System.out.print("原字符序列：");
		for(int i=1;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		Arrays.sort(a);
		System.out.print("升序排序后：");
		for(int i=1;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		System.out.print("请输入一个字符：");
		String tmp=input.next();
		char []cr=tmp.toCharArray();
		System.out.println("");
		System.out.println("");
		//找到插入位置
		int b=0;
		int j;
		for(j=1;j<a.length;j++){
			if(cr[0]<a[j]){
				b=j-1;
				break;
			}
		}
		if(j==a.length){
			b=a.length-1;
		}
		//前移
		for(int i=0;i<b;i++){
			a[i]=a[i+1];
		}
		//插入
		a[b]=cr[0];
		//输出
		System.out.print("插入字符后的字符序列：");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		System.out.print("插入的位置是："+b);
	}	
}