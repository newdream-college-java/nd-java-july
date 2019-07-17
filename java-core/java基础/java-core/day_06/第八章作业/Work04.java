/*1.4¡¢ ÇóºÍ:1!+2£¡+3£¡+4£¡+......+10!*/
public class Work04{
	public static void main(String [] args ){
		int sum=0;
		for(int i=1;i<=10;i++){
			int jc=1;
			for(int j=1;j<=i;j++){
				jc*=j;
			}
		sum+=jc;
		}
		System.out.println("1!+2£¡+3£¡+4£¡+......+10!="+sum);
	}
}