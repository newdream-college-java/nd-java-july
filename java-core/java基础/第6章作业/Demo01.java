/*计算100以内的奇数和*/
public class Demo01{
	public static void main(String[] args){
		int sum=0;
		for(int i=1;i<=100;i++){
			if(i%2==1){
				sum+=i;
				System.out.println("i="+i);
			}
		}
		System.out.println("奇数和为："+sum);
	}
}