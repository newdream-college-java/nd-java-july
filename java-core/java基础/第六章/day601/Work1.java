/*1.1、计算 100 以内的奇数之和*/
public class Work1{
	public static void main(String[] args){
		int sum = 0;
		for(int i =1;i<=100;i=i+2){
			sum = sum+i;
		}
		System.out.println("奇数和为："+sum);
	}
}