/*1.4¡¢ ÇóºÍ:1!+2£¡+3£¡+4£¡+......+10!*/
public class Demo04{
	public static void main(String [] args){
		int sum=0;
		for(int i=1;i<=10;i++){
			int count=1;
			for(int j=1;j<=i;j++){
				count*=j;
			}
			sum+=count;
		}
		System.out.println("1!+2£¡+3£¡+4£¡+......+10!="+sum);
	}
}