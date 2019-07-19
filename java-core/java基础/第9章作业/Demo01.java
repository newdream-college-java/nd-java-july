/*
定义特价商品数组，存储 5 件商品名称，控制台显示特价商品名称
*/
import java.util.*;
public  class Demo01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String arr[]=new String[5];
		for(int i=0;i<arr.length;i++){
			System.out.print("请输入第"+(i+1)+"件商品名称：");
			arr[i]=input.next();
		}
		System.out.println("本次活动特价商品有：");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}