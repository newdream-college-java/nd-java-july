/*1.1、计算 100 以内的奇数之和*/
public class A{
	public static void main(String[] args){
		int sum=0;	
		for(int i=1;i<=50;i++){
			sum+=2*i-1;
		}
		System.out.println("100以内奇数和为："+sum);
	}
}