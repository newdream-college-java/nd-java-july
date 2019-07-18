/*	
	求和:1!+2！+3！+4！+......+10!
 */

public class D{
	public static void main (String[] args){
		int sum=0;
		for(int i=1;i<=10;i++){
			int a=1;
			for(int j=i;j>0;j--){
				a=a*j;
			}
			System.out.println(a);
			sum=sum+a;
		}
		System.out.println("1!+2！+3！+4！+......+10!的总和为："+sum);
	}
}