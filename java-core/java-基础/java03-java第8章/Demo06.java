/*
	定义一个数组保存四大美人名字，然后输出4大美人名字
*/
import java.util.*;
public class Dem06{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		//1.申明数组
		String[] names;
		//2.定义数组
		names = new String[5];
		//3.逐个赋值
		//names[0]="王昭君";
		//names[1]="貂蝉";
		//names[2]="西施";
		//names[3]="杨玉环";
		for(int i=0;i<names.length;i++){
			//提示
			System.out.print("请输入4大美人的名字：");
			names[i] = input.next();

		}
		";
		//4.使用---输出
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
		//System.out.println(names[0]);
		//System.out.println(names[0]);


	}
}