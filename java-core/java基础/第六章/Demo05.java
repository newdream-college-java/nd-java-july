/*
1.5、求 100-999 之间的水仙花数。（例如：水仙花数 153=1*1*1+5*5*5+3*3*3）
*/
public class Demo05{
	public static void main (String [] args){
		int a,b,c;
		for(int i =100;i<=999;i++){
			a=i%10;
			b=i/10%10;
			c=i/100%10;
			if((a*a*a+b*b*b+c*c*c)==i){
				System.out.println(i);
			}
		}
	}
}		