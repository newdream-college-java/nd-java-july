/*
	定义一个数组保存四大美人名字，输入一个人的名字查找是否在数组中，如果再输出
	这个人在下标为x的数组中，否则输出 查无此人！！
	int i=1;
	for(;i<100;i++){
		输出...
	}
	System.out.println(i); 100
*/
import java.util.*;
public class Demo03{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		String[] names= {"王昭君","貂蝉","杨玉环","西施"};
		//查找
		System.out.print("请输入你查找的人的名字：");

		String name = input.next();
		boolean bj = false;//假设没有这个人

		int i=0;
		for(;i<names.length;i++){	
			if(names[i].equals(name)){
				bj = true;//假设不成绩 改变标记法
				System.out.println(name+"是数组的第"+i+"下标的元素");
				break;//退出循环
			}
		} 
		//查无此人的前提：1.所有房间找完，2.没有一个房间有这个人
		//方式一：巧妙使用数组下标
		//if(i==names.length){
		//	System.out.println("查无此人！！！");
		//}
		//方式二：标记法
		//if(bj==false){
		if(!bj){
			System.out.println("查无此人！！！");
		}

		
		

	}
}