/*	计算 100 以内的奇数之和
*/

public class A{
	public static void main(String[] args){
		int sum=0;
		for(int i=1;i<100;i++){
			if(i%2==0){
				continue;
			}
			sum=sum+i;			
		}
		System.out.println("总和为："+sum);
	}
}
	

	
