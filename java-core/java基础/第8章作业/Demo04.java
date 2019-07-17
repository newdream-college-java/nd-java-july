/*ÇóºÍ:1!+2£¡+3£¡+4£¡+......+10!*/
public class Demo04{
	public static void main(String[] args){
		int sum=0;		
		for(int i=1;i<11;i++){
			int a=1;
			for(int j=1;j<=i;j++){
				a*=j;
			}
			System.out.println(i+"!="+a);
			sum+=a;
		}
		System.out.println("sum="+sum);
	}
}