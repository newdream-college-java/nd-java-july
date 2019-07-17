public class hw4{
	public static void main(String[] args){
		int sum=0;
		int a=1;
		for(int i=1;i<=10;i++){
			for(int j=1;j<=i;j++){
				a=a*j;
			}
			sum+=a;
		}
		System.out.print("ºÍÎª"+sum);
	}
}