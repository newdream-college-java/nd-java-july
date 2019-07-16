/*求 100-999 之间的水仙花数。（例如：水仙花数 153=1*1*1+5*5*5+3*3*3）*/
public class Demo05{
	public static void main(String[] args){
		for(int i=100;i<=999;i++){
			int a=i/100;
			int b=(i/10)%10;
			int c=i%10;
			if(i==(a*a*a+b*b*b+c*c*c)){
				System.out.println("水仙花数："+i);
				continue;
			}
		}
	}
}