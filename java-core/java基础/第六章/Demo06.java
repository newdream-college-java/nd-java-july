/*
1.6、计算 1*2*3*……*10 的结果
*/
public class Demo06{
	public static void main (String [] args){
		int sum=1;
		int i=1;
		while(i<=10){
			sum=sum*i;
			i++;
		}
		System.out.print(sum);
	}
}