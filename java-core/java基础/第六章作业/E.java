/*1.5、求 100-999 之间的水仙花数。（例如：水仙花数 153=1*1*1+5*5*5+3*3*3）*/
public class E{
	public static void main(String[] srgs){
		System.out.println("100-999 之间的水仙花数:");
		for(int i=100;i<1000;i++){
			int a=i/100,b=i/10%10,c=i%10;
			if(i==a*a*a+b*b*b+c*c*c){
				System.out.println(i);
			}
		}
	}
}