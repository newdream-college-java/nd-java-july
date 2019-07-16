/*1.1、计算 100 以内的奇数之和*/
public class Demo01{
	public static void main(String[]args){
		int sum=0;
		for(int i=1;i<=100;i+=2){
			sum+=i;
		}
		System.out.println("100 以内的奇数之和为："+sum);
	}	
}