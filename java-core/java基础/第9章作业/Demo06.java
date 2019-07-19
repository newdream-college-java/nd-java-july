import java.util.Scanner;
/*
 从键盘上输入 10 个整数，合法值为 1、2、3。不是这 3 个数则为非法数字。
编程统计每个 整数和非法数字的个数。
 */

public class Demo06 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入数组长度：");
		int n=input.nextInt();
		int arr[]=new int[n];
		int count1=0,count2=0,count3=0,count4=0;
		for(int i=0;i<arr.length;i++){
			System.out.print("请输入第"+(i+1)+"个整数：");
			arr[i]=input.nextInt();
			if(arr[i]==1){
				count1++;
			}else if(arr[i]==2){
				count2++;
			}else if(arr[i]==3){
				count3++;
			}else{
				count4++;
			}
		}
		System.out.println("数字为1的个数为："+count1);
		System.out.println("数字为2的个数为："+count2);
		System.out.println("数字为3的个数为："+count3);
		System.out.println("非法数字的个数为："+count4);
	}
}
