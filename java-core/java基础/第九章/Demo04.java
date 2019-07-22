/*
向上一个练习中得到的升序字符序列中插入一个新的字符，要求插入之后字符序列
仍保 持有序 修改上一个题目的代码，定义长度为 9 的数组，保存原字符序列 按上
一题方法实现字符序列排序找到新增字符的插入位置 从插入位置开始的元素均后
移一个位置 插入新的字符，并输出结果  
*/
import java.util.*;
public class Demo04{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入数组长度:");
		int l= input.nextInt();
		char [] a =new char[l];
		for(int i =0;i<l-1;i++){
			System.out.print("请输入第"+(i+1)+"个字符为：");
			a[i]=input.next().charAt(0);
		}
		System.out.print("原字符序列：");
		for(int i =0;i<l-1;i++){
			System.out.print(a[i]+" ");
		}
		Arrays.sort(a);
		System.out.print("\n升序排序后：");
		for(int i =1;i<l;i++){
			System.out.print(a[i]+" ");
		}
		int index =0;
		boolean flag =false;
		System.out.print("\n请输入一个字符:");
		char b=input.next().charAt(0);
		for(int i=1;i<l;i++){
			if(b<a[i]){
				flag = true;
				index=i-1;	
				break;
			}
		}
		if(!flag){
			index = l-1;	
		}
		for(int i=0;i<index;i++){
			a[i]=a[i+1];
		}
		a[index]=b;
		System.out.print("\n插入字符后的字符序列：");
		for(int i =0;i<l;i++){
			System.out.print(a[i]+" ");
		}
		System.out.print("\n插入位置："+index);
	}
}