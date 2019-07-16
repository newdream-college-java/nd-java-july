/*1.1、计算 100 以内的奇数之和*/
public class Work01{
	public static void main(String[] args){
		int sum=0;
		for(int i=1;i<=100;i++){
			if(i%2==0){
				continue;
			}
			sum+=i;
		}
		System.out.println("100 以内的奇数之和："+sum);
	}
}