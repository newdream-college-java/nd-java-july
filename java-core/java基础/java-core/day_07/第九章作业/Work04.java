/*1.5向上一个练习中得到的升序字符序列中插入一个新的字符，要求插入之后字符序列仍保 持有序 修改上一个题目的代码，定义长度为 9 的数组，保存原字符序列 按上一题方法实现字符序列排序找到新增字符的插入位置 从插入位置开始的元素均后移一个位置 插入新的字符，并输出结果*/
import java.util.*;
public class Work04{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		char[] c={0,'a','c','u','b','e','p','f','z'};
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
		System.out.print("请输入一个字符：");
		char a=input.next().charAt(0);
		int index=0;
		int i=1;
		//先找到要插入的位置
		for(;i<c.length;i++){
			if(a<c[i]){
				index=i-1;
				break;
			}
		}
		if(i==c.length){
			index=c.length-1;
		}
		System.out.println("你要插入的数的下标为："+index);
		//移动数组元素
		for(int j=0;j<index;j++){
			c[j]=c[j+1];
		}
		//插入元素
		c[index]=a;
		for(int k=0;k<c.length;k++){
			System.out.print(c[k]+"\t");
		}
	}
}