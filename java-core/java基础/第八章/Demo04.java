/*
1.4¡¢ ÇóºÍ:1!+2£¡+3£¡+4£¡+......+10!
*/
public class Demo04{
	public static void main(String[] args){
		int sum2=0;
		for(int i =1;i<=10;i++){
			int sum1=1;
			for(int j =1;j<=i;j++){
				sum1=sum1*j;
			}
			sum2=sum2+sum1;
		}
		System.out.print(sum2);
	}
}